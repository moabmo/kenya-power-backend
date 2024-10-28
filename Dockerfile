# Use an official Java 23 runtime as the base image
FROM eclipse-temurin:23-jre

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
COPY target/reportapp-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that Spring Boot runs on (default is 8080)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
