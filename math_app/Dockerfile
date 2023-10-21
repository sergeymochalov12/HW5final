
FROM openjdk:11-jdk as build

WORKDIR /app

COPY src /app/src

RUN javac -d /app/out /app/src/main/java/com/example/*.java /app/src/main/java/com/example/calculator/*.java

WORKDIR /app/out

CMD ["java", "com.example.Main"]
