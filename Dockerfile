FROM openjdk:8-jdk-alpine
WORKDIR /
COPY target/*.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/urandom","-jar","/app.jar"]