FROM openjdk:8
ADD target/todo-list.jar todo-list.jar
ENTRYPOINT["jar", "-jar", "todo-list.jar"]
