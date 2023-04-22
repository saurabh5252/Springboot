FROM openjdk:11
RUN mkdir /spring
COPY target/spring-boot-app.jar /spring/
WORKDIR /spring/
ENTRYPOINT ["Java","-jar","spring-boot-app.jar]