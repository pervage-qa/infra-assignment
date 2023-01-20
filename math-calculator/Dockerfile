FROM pervage/infra-base:latest

RUN mkdir -p /usr/maven

WORKDIR /usr/maven

COPY ./pom.xml .

COPY /src ./src

RUN mvn package

CMD [ "java", "-cp", "target/math-calculator-1.0-SNAPSHOT.jar", "math.calculations.Calculations" ]