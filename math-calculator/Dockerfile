FROM pervage/infra-base:latest

RUN mkdir -p /usr/maven

WORKDIR /usr/maven

COPY /math-calculator/pom.xml .

COPY /math-calculator/src ./src

RUN mvn package

CMD [ "java", "-cp", "target/math-calculator-1.0-SNAPSHOT.jar", "math.calculations.Calculations" ]