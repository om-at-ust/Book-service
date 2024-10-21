FROM amazoncorretto:23
COPY ./target/book-service-0.0.1-SNAPSHOT.jar book-service.jar
CMD ["java","-jar","book-service.jar"]