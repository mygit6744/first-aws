FROM openjdk:21-jdk AS BUILD_IMAGE
RUN git clone https://github.com/mygit6744/first-aws.git
RUN mvn install
COPY target/first-aws-0.0.1-SNAPSHOT.jar first-aws-0.0.1-SNAPSHOT.jar
EXPOSE 9091
ENTRYPOINT ["java","-jar","/first-aws-0.0.1-SNAPSHOT.jar.jar"]