FROM openjdk:11
VOLUME /tmp
ADD ./target/Authorization-Server-0.0.1-SNAPSHOT.jar hr-oauth.jar
ENTRYPOINT ["java","-jar","/hr-oauth.jar"]