# author: @itsecurityco

FROM tomcat:9.0.60-jdk11-openjdk
ADD src/ /demo/src
ADD pom.xml /demo
RUN apt update && apt install maven -y
WORKDIR /demo/
RUN mvn clean package
RUN mv target/demo.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]