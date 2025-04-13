FROM maven:3-jdk-21-alpine AS build
RUN mvn clean install -DskipTests
FROM openjdk:21-jdk
COPY target/first-aws-0.0.1-SNAPSHOT.jar first-aws-0.0.1-SNAPSHOT.jar
EXPOSE 9091
ENTRYPOINT ["java","-jar","/first-aws-0.0.1-SNAPSHOT.jar.jar"]