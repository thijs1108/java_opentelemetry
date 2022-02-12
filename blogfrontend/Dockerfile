FROM node:14 as node
RUN npm i -g @angular/cli
WORKDIR /app
COPY . .
RUN npm install
RUN ng build --prod

#stage 2
FROM nginx:alpine
COPY --from=node /app/dist/blogfrontend /usr/share/nginx/html
