FROM openjdk:17-jdk-slim
EXPOSE 8080
ADD build/libs/spring-monitoring-alert-kube.jar spring-monitoring-alert-kube.jar
ENTRYPOINT ["java","-jar","/spring-monitoring-alert-kube.jar"]