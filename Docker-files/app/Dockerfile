FROM openjdk:21-jdk
RUN apt update && apt install maven -y
RUN git clone https://github.com/mygit6744/first-aws.git
RUN cd first-aws && git checkout docker && mvn install
EXPOSE 9091
ADD target/first-aws-0.0.1-SNAPSHOT.jar first-aws-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/first-aws-0.0.1-SNAPSHOT.jar.jar"]