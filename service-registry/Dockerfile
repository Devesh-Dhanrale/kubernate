FROM openjdk:11 

ADD target/serviceregistry.jar serviceregistry.jar

EXPOSE 8761

ENTRYPOINT ["java","-jar","serviceregistry.jar"]
 
