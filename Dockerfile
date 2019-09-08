FROM maven:latest AS build

LABEL maintainer="Felix Klauke <info@felix-klauke>"

COPY . .

RUN mvn clean install