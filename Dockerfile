FROM openjdk:21-jdk
EXPOSE 9091
ADD target/first-aws.jar first-aws.jar
ENTRYPOINT ["java","-jar","/first-aws.jar"]
