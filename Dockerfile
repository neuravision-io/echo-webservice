FROM openjdk:21-jdk
MAINTAINER Samuel Abramov
COPY build/libs/echo-webservice-0.0.1-RELEASE.jar echo-webservice-0.0.1-RELEASE.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/echo-webservice-0.0.1-RELEASE.jar"]

