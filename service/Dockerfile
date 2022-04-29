FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} service.jar
ENTRYPOINT ["java","-jar","/service.jar"]
#specify port to expose from container
EXPOSE ${SERVICE_PORT_APP}