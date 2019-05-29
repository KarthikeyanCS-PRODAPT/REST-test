#base image - OS: Liinux, Gradle: 4.9, Openjdk: 1.8.0_181
FROM gradle:4.9-jdk8-slim

#dockerfile metadata
LABEL company="Prodapt Solutions" \
      maintainer="Prodapt Solutions" \
      version="1.0" \
      description="This Dockerfile builds and runs test client"
	  
#app build arguments
ARG BUILD_APP=rest-sample
ARG APP_MODULE=RestWeb
ARG APP_HOME=/home/gradle

#set workign directory
WORKDIR $APP_HOME

USER root

#copy sourcec
COPY . . 

#gradle build with proxy arguments

RUN gradle bootJar

RUN cp build/libs/*.jar .

#application run command
CMD java -Xms768m -Xmx1024m -jar rest-sample-*-SNAPSHOT.jar
