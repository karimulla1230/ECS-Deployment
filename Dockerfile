FROM openjdk:latest

ADD target/ECS-Deployment-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar", "ecsdeployment.jar"]

EXPOSE 8081