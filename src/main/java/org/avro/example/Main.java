package org.avro.example;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.avro.example.generated.Repository;
import org.avro.example.generated.User;

public class Main {
  private static final String USER_AVRO_FILE = "users.avro";
  private static final String REPOSITORY_AVRO_FILE = "repositories.avro";

  public static void main(String[] args) throws IOException {
    // Serialization and Deserialization with code generation
    AvroSerializationUtils<User> avroSerializationUser = new AvroSerializationUtils<User>(new File(USER_AVRO_FILE));
    
    User user = User.newBuilder().setId(1L).setLogin("moisesdev").setPublicRepos(1).setTwoFactorAuthentication(false)
        .setUrl("https://api.github.com/users/moisesdev").build();

    avroSerializationUser.serealizeToAvroFile(User.class, user);

    List<User> users = avroSerializationUser.deserializeFromAvroFile(User.class);
    for (User userRecord : users) {
      System.out.println(userRecord);
    }

    // Serialization and Deserialization Repository
    AvroSerializationUtils<Repository> avroSerializationRepo = new AvroSerializationUtils<Repository>(new File(REPOSITORY_AVRO_FILE));

    Repository repository = Repository.newBuilder().setId(1L).setName("apache-avro-example")
        .setUrl("https://api.github.com/repos/octocat/apache-avro-example").setDescription("Avro example")
        .setForksCount(1).setOwner(user).setPrivate$(false).setTopics(List.of("java", "avro")).build();
    avroSerializationRepo.serealizeToAvroFile(Repository.class, repository);

    List<Repository> repositories = avroSerializationRepo.deserializeFromAvroFile(Repository.class);
    for (Repository repo : repositories) {
      System.out.println(repo);
    }


    // Serialization and Deserialization without code generation
    Schema schema = new Schema.Parser().parse(new File("src/main/java/avro/user.avsc"));
        
    GenericRecord user2 = new GenericData.Record(schema);
    user2.put("id", 2L);
    user2.put("login", "cisco");
    user2.put("url", "https://api.github.com/users/moisesdev");
    user2.put("two_factor_authentication", true);
    user2.put("public_repos", 2);

    avroSerializationUser.serealizeGenericRecordToAvroFile(user2, schema);
   
    for (User userRecord : avroSerializationUser.deserializeFromAvroFile(User.class)) {
      System.out.println(userRecord);
    }

  }
}