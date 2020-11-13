package org.avro.example;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.specific.SpecificRecordBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AvroSerializationUtils<T extends SpecificRecordBase> {
  private static final Logger LOGGER = LoggerFactory.getLogger(AvroSerializationUtils.class);  
  private File avroDataFile;

  public AvroSerializationUtils(){
    super();    
  }

  public AvroSerializationUtils(File avroDataFile){
    this.avroDataFile = avroDataFile;
  }

  public void serealizeToAvroFile(Class<T> clazz, T record) {
    DatumWriter<T> userDatumWriter = new SpecificDatumWriter<T>(clazz);
    DataFileWriter<T> dataFileWriter = new DataFileWriter<T>(userDatumWriter);
    try {
      dataFileWriter.create(record.getSchema(), avroDataFile);
      dataFileWriter.append(record);        
      dataFileWriter.close();
    } catch (IOException e) {
      LOGGER.error("m=serealizeToAvroFile", e);
    }
  }

  public List<T> deserializeFromAvroFile(Class<T> clazz) {
    List<T> records = new ArrayList<T>();
    try {
      DatumReader<T> userDatumReader = new SpecificDatumReader<T>(clazz);
      DataFileReader<T> dataFileReader = new DataFileReader<T>(avroDataFile, 
        userDatumReader);

      T record = null;
      while (dataFileReader.hasNext()) {
        record = dataFileReader.next();
        records.add(record);
      }

      dataFileReader.close();
    } catch (IOException e) {
      LOGGER.error("m=deserealizeFromAvroFile", e);
    }
    return records;
  }

  public void serealizeGenericRecordToAvroFile(GenericRecord record, Schema schema) {
    DatumWriter<GenericRecord> userDatumWriter = new SpecificDatumWriter<GenericRecord>(schema);
    DataFileWriter<GenericRecord> dataFileWriter = new DataFileWriter<GenericRecord>(userDatumWriter);
    try {
      dataFileWriter.create(schema, avroDataFile);
      dataFileWriter.append(record);        
      dataFileWriter.close();
    } catch (IOException e) {
      LOGGER.error("m=serealizeGenericRecordToAvroFile", e);
    }
  }

  public byte[] serealizeToJSON(Class<T> clazz, SpecificRecordBase record) {
    DatumWriter<T> writer = new SpecificDatumWriter<T>(clazz);
    byte[] data = new byte[0];
    ByteArrayOutputStream stream = new ByteArrayOutputStream();
    Encoder jsonEncoder = null;
    try {
      jsonEncoder = EncoderFactory.get().jsonEncoder(record.getSchema(), stream);
      writer.write((T) record, jsonEncoder);
      jsonEncoder.flush();
      data = stream.toByteArray();
    } catch (IOException e) {
      LOGGER.error("m=serealizeToJSON", e);
    }
    return data;
  }

}
