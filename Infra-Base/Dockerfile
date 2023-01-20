FROM openjdk:17-alpine

ENV NAME Pervage
ENV TECHSTACK Bash,Docker,Kubernetes
ENV MAVEN_VERSION 3.8.5
ENV MAVEN_HOME /usr/lib/mvn
ENV PATH $MAVEN_HOME/bin:$PATH

RUN apk add git
RUN apk add --update npm
RUN apk add neofetch

RUN wget http://archive.apache.org/dist/maven/maven-3/$MAVEN_VERSION/binaries/apache-maven-$MAVEN_VERSION-bin.tar.gz && \
  tar -zxvf apache-maven-$MAVEN_VERSION-bin.tar.gz && \
  rm apache-maven-$MAVEN_VERSION-bin.tar.gz && \
  mv apache-maven-$MAVEN_VERSION /usr/lib/mvn

COPY ./system-info.sh .

CMD [ "/bin/sh", "-c", "./system-info.sh" ]

