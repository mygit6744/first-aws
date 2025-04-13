FROM openjdk:21-jdk
COPY C:/ProgramData/Jenkins/.jenkins/workspace/first-aws/target/first-aws.jar first-aws.jar
EXPOSE 9091
ENTRYPOINT ["java","-jar","/first-aws.jar"]
