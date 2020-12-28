FROM openjdk:8
ADD target/config-server-0.0.1-SNAPSHOT.jar configServer.jar
EXPOSE 5050
ENTRYPOINT ["java", "-jar", "configServer.jar"]