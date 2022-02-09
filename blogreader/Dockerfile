FROM maven:3.8.4-amazoncorretto-17 AS BUILD_IMAGE
ENV APP_HOME=/web
WORKDIR $APP_HOME
RUN curl -L https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/download/v1.10.1/opentelemetry-javaagent.jar -o $APP_HOME/otelagent.jar
COPY ./src ./src
COPY pom.xml pom.xml
RUN mvn package
COPY ./target/blogreader-0.0.1-SNAPSHOT.jar blogreader.jar

FROM eclipse-temurin:17-jre-alpine
WORKDIR /root/
COPY --from=BUILD_IMAGE /web/blogreader.jar .
COPY --from=BUILD_IMAGE /web/otelagent.jar .
EXPOSE 8081
#CMD ["java","-jar","blogreader.jar"]
#https://github.com/open-telemetry/opentelemetry-java/blob/main/sdk-extensions/autoconfigure/README.md#otlp-exporter-both-span-and-metric-exporters
CMD ["java","-javaagent:otelagent.jar","-Dotel.resource.attributes=service.name=blogreader","-Dotel.traces.exporter=otlp","-Dotel.exporter.otlp.traces.endpoint=http://oltp:4317","-jar","blogreader.jar"]