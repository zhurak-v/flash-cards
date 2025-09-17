FROM maven:3.9.5-eclipse-temurin-21 AS build
WORKDIR /app/src

COPY src/pom.xml .
COPY src/common/pom.xml common/
COPY src/user/pom.xml user/
COPY src/profile/pom.xml profile/
COPY src/application/pom.xml application/

RUN --mount=type=cache,target=/root/.m2 \
    mvn dependency:go-offline -pl application -am -B

COPY src/. .

RUN --mount=type=cache,target=/root/.m2 \
    mvn clean package -pl application -am -DskipTests

FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/src/application/target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
