FROM openjdk:8-jdk-alpine

WORKDIR /app

# The application's jar file
ARG JAR_FILE=target/configmap-*.jar

# Add the application's jar to the container
ADD ${JAR_FILE} configmap.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/configmap.jar"]
