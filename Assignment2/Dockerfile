FROM pervage/infra-base:latest
RUN mkdir /usr/app
WORKDIR /usr/app
RUN apk update && apk add openjdk11 && rm -rf /var/cache/apk/*
ENTRYPOINT ["/bin/sh", "-c", "java --version"]