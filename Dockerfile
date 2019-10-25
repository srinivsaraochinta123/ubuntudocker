FROM openjdk:8-jdk-alpine
ADD target/ubuntu-project-0.0.1-SNAPSHOT.jar ubuntu-project-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["sh","-c","-jar","java -jar /ubuntu-project-0.0.1-SNAPSHOT.jar"]