rm ./src/main/java/org/avro/example/generated/*
java -jar /home/dbitencourt/.m2/repository/org/apache/avro/avro-tools/1.8.2/avro-tools-1.8.2.jar compile schema src/main/java/avro/user.avsc ./src/main/java/
java -jar /home/dbitencourt/.m2/repository/org/apache/avro/avro-tools/1.8.2/avro-tools-1.8.2.jar compile schema src/main/java/avro/repository.avsc ./src/main/java/
