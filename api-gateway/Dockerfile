FROM openjdk:11-jre-slim
EXPOSE 8083
ADD ./target/api-gateway-0.0.1-SNAPSHOT.jar /usr/src/api-gateway-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","api-gateway-0.0.1-SNAPSHOT.jar"]