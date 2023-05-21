FROM adoptopenjdk/openjdk11:jdk-11.0.2.9-slim
WORKDIR /rama
COPY ./target/LearningSpringDto-0.0.1-SNAPSHOT.jar /rama/LearningSpringDto-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT exec java $JAVA_OPTS -jar LearningSpringDto-0.0.1-SNAPSHOT.jar