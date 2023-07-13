FROM openjdk:17-jdk-alpine
WORKDIR /weather

COPY ./build/libs/weather-*-all.jar ./weather.jar
EXPOSE 7045

ENTRYPOINT ["java", "-jar", "weather.jar"]
