FROM pervage/infra-base:latest

ENV MAVEN_VERSION 3.8.5
ENV MAVEN_HOME /usr/lib/mvn
ENV PATH $MAVEN_HOME/bin:$PATH

RUN apk add git

RUN wget http://archive.apache.org/dist/maven/maven-3/$MAVEN_VERSION/binaries/apache-maven-$MAVEN_VERSION-bin.tar.gz && \
  tar -zxvf apache-maven-$MAVEN_VERSION-bin.tar.gz && \
  rm apache-maven-$MAVEN_VERSION-bin.tar.gz && \
  mv apache-maven-$MAVEN_VERSION /usr/lib/mvn

RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app

RUN git clone https://github.com/pervage-qa/infra-assignment.git /usr/src/app/javaApp/

RUN javac Calculations.java -d bin

CMD ["java", "-cp", "bin", "mathematical.operations.Calculations"]