FROM openjdk:8u181-jre-alpine3.8
VOLUME /tmp
EXPOSE 8910
EXPOSE 5005
COPY registry/target/init-0.0.1-SNAPSHOT.jar registry.jar
ENTRYPOINT exec java $JAVA_OPTS -jar registry.jar