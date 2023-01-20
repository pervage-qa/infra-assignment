FROM pervage/infra-base:latest

RUN mkdir -p /usr/src/

WORKDIR /usr/src/

COPY math-calculator/pom.xml .

COPY math-calculator/src ./usr/src

RUN mvn package

CMD [ "java", "-cp", "target/math-calculator-1.0-SNAPSHOT.jar", "math.calculations.Calculations" ]