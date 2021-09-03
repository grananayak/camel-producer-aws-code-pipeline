FROM openjdk:8
EXPOSE 8080
ADD target/camel-prducer-0.0.1-SNAPSHOT.jar camel-prducer-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","/camel-prducer-0.0.1-SNAPSHOT.jar"]
