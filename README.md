## Build
### Application
```bash
./gradlew build
```

### Docker Image
```bash
# docker build -t ${imageName}:${tagName} .docker build -t ${imageName}:${tagName} .
docker build -t perfectacle/spring-boot-demo:unpack-jar .
```

## Run
### Application
```bash
./gradlew bootRun
```

### Docker Container
```bash
# docker run --rm -d -p ${hostPort}:${containerPort} --name ${containerName} ${imageName}:${tagName}
docker run --rm -d -p 80:8080 --name demo perfectacle/spring-boot-demo:unpack-jar
```

## Test
### Application
```bash
curl localhost:8080

# ok
```

### Docker Container
```bash
curl localhost

# ok
```

## Push
### Docker Image
```bash
# docker push ${repositoryName}:${tagName}
docker push perfectacle/spring-boot-demo:unpack-jar
```