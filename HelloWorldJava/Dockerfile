FROM openjdk:13-alpine
COPY . /usr/src/helloworldjava
WORKDIR /usr/src/helloworldjava
RUN javac --release 13 --enable-preview -Xlint:preview HelloWorld.java
CMD ["java", "--enable-preview", "HelloWorld"]
