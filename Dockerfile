FROM openjdk:10-jre-slim
WORKDIR /app
COPY build/libs/*.jar /app/account-service.jar
EXPOSE 8711
CMD ["java", "-jar", "/app/account-service.jar"]