FROM openjdk:11-jdk-slim
COPY target/demo-0.0.1-SNAPSHOT.jar demo_app.jar
ENTRYPOINT ["java", "-jar", "/demo_app.jar"]