 FROM openjdk:21-jdk
 RUN git clone https://github.com/mygit6744/first-aws.git
 RUN cd first-aws && git checkout docker && mvn install
 EXPOSE 9091
 COPY target/first-aws.jar first-aws.jar
 ENTRYPOINT ["java","-jar","/first-aws.jar"]
