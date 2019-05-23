# production Dockerfile
FROM openjdk:8 AS Builder
RUN apt-get update
RUN apt-get install -y maven
COPY pom.xml /app/pom.xml
COPY src /app/src
WORKDIR /app
RUN mvn clean install

FROM openjdk:8-jre-alpine
EXPOSE 80
WORKDIR /deployed-app
COPY --from=Builder /app/target/backend-app.jar .
ENTRYPOINT ["java", "-jar", "backend-app.jar"]    
