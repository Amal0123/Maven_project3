#https://spring.io/guides/gs/spring-boot-docker/
FROM openjdk:8-jdk-alpine
COPY target/docker-0.0.1.jar /
CMD java -jar /docker-0.0.1.jar
#sudo docker run -d --name demoboot-container -p 8080:8080 demoboot
#sudo docker ps
#sudo docker logs demoboot-container
#Le plugin Docker est à tester.