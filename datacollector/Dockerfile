FROM openjdk:8u181-jre-alpine3.8
VOLUME /tmp
EXPOSE 8910
EXPOSE 5005
COPY datacollector/target/datacollector-0.0.1-SNAPSHOT.jar datacollector.jar
ENTRYPOINT exec java $JAVA_OPTS -jar datacollector.jar