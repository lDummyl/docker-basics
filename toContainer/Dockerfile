FROM alpine
WORKDIR /root/basics
#inside of container
COPY ReadExternal.class /root/basics
ADD . /root/basics/data/in
#copy from Dockerfile location to path in container
 
#install jdk
RUN apk add openjdk8

ENV JAVA_HOME /usr/lib/jvm/java-1.8-openjdk
ENV PATH $PATH:$JAVA_HOME/bin

#run the jar
ENTRYPOINT java ReadExternal

