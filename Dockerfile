FROM openjdk:11-jre
LABEL maintainer="BCP-DEMO-SPRINGBOOT"
ENV spring.application.name categories

COPY build/libs/categories-*SNAPSHOT.jar /opt/categories.jar
ENTRYPOINT ["java", "-Djava.file.encoding=UTF-8", "-jar", "/opt/categories.jar"]