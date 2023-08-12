# projectHosting
Proyecto para explicacion de video youtube (Alojar API Spring Boot en Servicio Web gratuito RENDER.COM)

db
--------------------------------
create table producto(
idproducto int not null auto_increment primary key,
nombreproducto varchar(50) not null,
precioproducto int not null,
cantidadproducto int not null,
fecha date not null
);


Commands create jar -  Build docker
--------------------------------
./mvnw clean package
java -jar target/nomreJAR.jar
docker build -t nombre:etiqueta .
docker run -p 8080:8080 nombre:etiqueta


Dockerfile
--------------------------------------
FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/project-0.0.1-SNAPSHOT.jar project.jar
EXPOSE 8080
ENTRYPOINT [ "java","-jar","project.jar" ]
