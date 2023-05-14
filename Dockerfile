FROM amazoncorretto:17

MAINTAINER luanacuello

COPY target/BACKEND-0.0.1-SNAPSHOT.jar BACKEND-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/BACKEND-0.0.1-SNAPSHOT.jar"]
