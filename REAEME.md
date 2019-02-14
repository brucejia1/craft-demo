
To build docker image

  mvn install dockerfile:build

To run the app in docker container, type: 

  docker run -p 8080:8080 -t exec/docker-simpleapp