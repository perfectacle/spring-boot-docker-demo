FROM openjdk:11-jre-slim

WORKDIR /root

ARG buildDir=build/unpack

COPY ${buildDir}/app .
COPY ${buildDir}/lib BOOT-INF/lib

CMD java org.springframework.boot.loader.JarLauncher