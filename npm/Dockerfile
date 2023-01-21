FROM pervage/infra-base:latest

MAINTAINER Pervage Alam<pervage.alam@thoughtworks.com>

RUN mkdir -p /usr/npm

WORKDIR /usr/npm

COPY ./package.json .

RUN npm install

COPY ./index.js .

CMD ["npm", "start"]

EXPOSE 3200