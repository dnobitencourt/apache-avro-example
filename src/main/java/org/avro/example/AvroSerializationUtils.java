package org.avro.example;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.File;

import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.specific.SpecificRecordBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AvroSerializationUtils<T extends SpecificRecordBase> {
  private static final Logger LOGGER = LoggerFactory.getLogger(AvroSerializationUtils.class);

  public void serealizeToAvroFile(Class<T> clazz, SpecificRecordBase record) {
    DatumWriter<T> userDatumWriter = new SpecificDatumWriter<T>(clazz);
    DataFileWriter<T> dataFileWriter = new DataFileWriter<T>(userDatumWriter);
    try {
      dataFileWriter.create(record.getSchema(), new File("users.avro"));
      dataFileWriter.append((T) record);
      dataFileWriter.close();
    } catch (IOException e) {
      LOGGER.error("Serialization error:" + e.getMessage());
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
      LOGGER.error("Serialization error:" + e.getMessage());
    }
    return data;
  }

}
