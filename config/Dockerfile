FROM openjdk:8u181-jre-alpine3.8
VOLUME /tmp
EXPOSE 8910
EXPOSE 5005
COPY config/target/datacollector-0.0.1-SNAPSHOT.jar config.jar
ENTRYPOINT exec java $JAVA_OPTS -jar config.jar