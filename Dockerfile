FROM openjdk:8
ADD target/todo-list.jar todo-list.jar
EXPOSE 8080
RUN bash -c 'touch /todo-list.jar'
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongo-inst/test","-Djava.security.egd=file:/dev/./urandom","-jar","todo-list.jar"]
