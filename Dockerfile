FROM alpine:latest AS BaseImage
RUN mkdir /usr/app
WORKDIR /usr/app
CMD [ "echo","Hello ! I am Pervage" ]

