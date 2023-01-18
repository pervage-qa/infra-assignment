FROM alpine
RUN mkdir /usr/app
WORKDIR /usr/app
ENTRYPOINT ["/bin/sh", "-c", "echo Hello !! I am Pervage"]

