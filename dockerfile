FROM openjdk:21

WORKDIR /app

COPY ./target/inteface_check_in-0.0.1-SNAPSHOT.jar /app/inteface_check_in.jar

EXPOSE 3000:8080

ENTRYPOINT ["java", "-jar", "/app/inteface_check_in.jar"]
# docker build -t inteface_check_in .