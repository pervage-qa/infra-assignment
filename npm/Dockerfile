FROM pervage/infra-base:latest

RUN mkdir -p /usr/npm

WORKDIR /usr/npm

COPY /node-hello/package.json .

RUN npm install

COPY /node-hello/index.js .

CMD ["npm", "start"]

EXPOSE 3200