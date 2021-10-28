FROM openjdk:11
ADD target/cats-project-0.0.1-SNAPSHOT.jar cats-project.jar
#EXPOSE 8088
ENTRYPOINT ["java","-jar","cats-project.jar"]