FROM alpine:latest
RUN mkdir /usr/app
WORKDIR /usr/app
CMD [ "echo","Hello ! I am Pervage" ]

