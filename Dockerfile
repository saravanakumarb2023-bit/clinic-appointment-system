FROM eclipse-temurin:17
COPY target/clinic-appointment-system-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]