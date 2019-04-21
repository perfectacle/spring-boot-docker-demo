FROM openjdk:11-jre-slim

WORKDIR /root

ARG buildDir=build/unpack

COPY ${buildDir}/BOOT-INF/classes/ app
COPY ${buildDir}/BOOT-INF/lib/ lib

CMD java -cp app:lib/* com.example.demo.DemoApplication