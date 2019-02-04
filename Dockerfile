FROM java:8
EXPOSE 8086
ADD target/ws_docker-0.0.1-SNAPSHOT.jar docker.jar
ENTRYPOINT ["java","-jar","docker.jar"]
