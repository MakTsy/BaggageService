FROM openjdk:14
ADD target/BaggageService.jar BaggageService.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "BaggageService.jar"]