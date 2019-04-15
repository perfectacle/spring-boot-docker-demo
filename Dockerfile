FROM openjdk:11-jre-slim

WORKDIR /root

ARG buildDir=build/unpack

COPY ${buildDir}/lib BOOT-INF/lib
COPY ${buildDir}/app .

CMD java org.springframework.boot.loader.JarLauncher