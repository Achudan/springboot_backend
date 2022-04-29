FROM openjdk:8-jdk-alpine
COPY target/springboot_backend.jar springboot_backend.jar
ENTRYPOINT ["java","-jar","/springboot_backend.jar"]