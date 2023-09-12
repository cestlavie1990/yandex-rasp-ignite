FROM openjdk:11

ADD build/libs/yandex-rasp-ignite-*.jar /yandex-rasp-ignite/yandex-rasp-ignite.jar

WORKDIR yandex-rasp-ignite

EXPOSE 8080

CMD java -jar yandex-rasp-ignite.jar