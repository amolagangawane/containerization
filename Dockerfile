FROM openjdk:21-jdk
WORKDIR /app
COPY ./target/container-0.0.1-SNAPSHOT.jar /app
CMD ["java","-jar","container-0.0.1-SNAPSHOT.jar"]