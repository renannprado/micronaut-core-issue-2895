# FROM oracle/graalvm-ce:19.3.1-java8 as graalvm
# For JDK 11
FROM oracle/graalvm-ce:20.0.0-java11 as graalvm
RUN gu install native-image

COPY . /home/app/bug
WORKDIR /home/app/bug

RUN native-image --no-server -cp build/libs/bug-*-all.jar

FROM frolvlad/alpine-glibc
RUN apk update && apk add libstdc++
EXPOSE 8080
COPY --from=graalvm /home/app/bug/bug /app/bug
ENTRYPOINT ["/app/bug"]
