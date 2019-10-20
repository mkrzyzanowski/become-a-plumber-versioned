# Spark & intercooler.js demo app

This folder contains a simple single-page application developed using Spark for Java framework and intercooler.js library.

It originally was described here: https://sparktutorials.github.io/2016/06/26/ajax-without-writing-javascript.html

## Screenshot
![Application Screenshot](https://sparktutorials.github.io/img/posts/sparkIntercooler/todoList.png)

## Building the application

To build the application:
```
mvn clean package
```

## Provisioning the application with Docker

1. Build the application image based on the attached `Dockerfile`: `docker build --tag plumbers/sparktodo:SNAPSHOT .`
2. Run a container based on the built image:
```
docker run -d -p 9999:<PORT> --name '<NAME>' plumbers/sparktodo:<VERSION>
```

where:
- `<PORT>` port on which the app will be running on the host
- `<NAME>` is the name of the container, so you can easily refer to it later on (to e.g. remove the container)
- `<VERSION>` is the version of the image you want to use