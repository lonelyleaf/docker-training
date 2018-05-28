#创建应用目录，并修改时区为中国
FROM openjdk:8u151-jre-alpine3.7

#创建应用目录，并修改时区为中国
RUN mkdir /app && \
    apk update && apk add ca-certificates && \
    apk add tzdata && \
    rm -rf /var/cache/apk/* &&\
    ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && \
    echo "Asia/Shanghai" > /etc/timezone

COPY ./target/*.jar /app/app.jar

CMD java -jar -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -server /app/app.jar