FROM pervage/infra-base:latest

RUN mkdir -p /usr/npm

WORKDIR /usr/npm

COPY ./package.json .

RUN npm install

COPY ./index.js .

CMD ["npm", "start"]

EXPOSE 3200