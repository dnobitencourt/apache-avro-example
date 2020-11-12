package org.avro.example;

import java.io.File;
import java.io.IOException;

import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;
import org.avro.example.generated.User;

public class Main {

  public static void main(String[] args) throws IOException {
    User user = User.newBuilder().setId(1L).setLogin("moisesdev").build();

    byte[] jsonBytes = new AvroSerializationUtils<User>().serealizeToJSON(User.class, user);
    System.out.println(new String(jsonBytes, "UTF8"));

    //String jsonStr = new ObjectMapper().writeValueAsString(jsonBytes);

    //System.out.println(jsonStr);
  }
}