FROM pervage/infra-base:latest

RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app

COPY ../mathematical /usr/src/app/

RUN javac /usr/src/app/operations/Calculations.java -d bin

CMD ["java", "-cp", "bin", "mathematical.operations.Calculations"]