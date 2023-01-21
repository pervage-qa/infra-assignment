FROM pervage/infra-base:latest

MAINTAINER Pervage Alam<pervage.alam@thoughtworks.com>

RUN mkdir -p /usr/maven

WORKDIR /usr/maven

COPY ./pom.xml .

COPY /src ./src

RUN mvn package

CMD [ "java", "-cp", "target/math-calculator-1.0-SNAPSHOT.jar", "math.calculations.Calculations" ]