# Use an official Maven image as the base image
FROM maven:3.8.4-openjdk-17-slim AS build
# Set the working directory in the container
WORKDIR /app
# Copy the pom.xml and the project files to the container
COPY pom.xml .
COPY deployment.yaml .
COPY src ./src
# Build the application using Maven
RUN mvn clean package -DskipTests
# Use an official OpenJDK image as the base image
FROM openjdk:17
# Set the working directory in the container

# Copy the built JAR file from the previous stage to the container
COPY --from=build /app/target/SpringBootKubernetesSample-1.0.0.jar .
WORKDIR /app
EXPOSE 8181

ENTRYPOINT ["java","-jar","/SpringBootKubernetesSample-1.0.0.jar"]
