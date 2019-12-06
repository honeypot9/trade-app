FROM openjdk:8u181-jre-alpine3.8
VOLUME /tmp
EXPOSE 8910
EXPOSE 5005
COPY analytics/target/analytics-0.0.1-SNAPSHOT.jar analytics.jar
ENTRYPOINT exec java $JAVA_OPTS -jar analytics.jar