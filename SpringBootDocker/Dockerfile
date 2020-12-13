FROM tomcat:9.0.24
VOLUME /tmp
COPY target/Spring-Boot-Docker.war /usr/local/tomcat/webapps/Spring-Boot-Docker.war
EXPOSE 8086
ENTRYPOINT [ "java", "-jar", "/usr/local/tomcat/webapps/Spring-Boot-Docker.war" ]