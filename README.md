./gradlew jibDockerBuild
docker run -p 8080:8080 coffee-iot:0.0.1-SNAPSHOT
