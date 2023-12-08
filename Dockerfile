# Use an official OpenJDK runtime as a base image
#FROM rsunix/yourkit-openjdk17

# Use the official Tomcat image as the base image
# FROM alpinelinux/docker-cli
FROM tomcat:latest

# Remove the default Tomcat applications
RUN rm -rf /usr/local/tomcat/webapps/*

COPY . /src
# Copy your application WAR file to the Tomcat webapps directory
COPY target/students-task-0.0.1-SNAPSHOT.jar /usr/local/tomcat/webapps/

#////////////////////////////////////////////////////////////////////////
# Set the working directory inside the container
# WORKDIR /app

# # Copy the executable JAR file into the container at /app
# COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar
#////////////////////////////////////////////////////////////////////////


# Expose the port that your application will run on
EXPOSE 7070

# Specify the command to run your application
CMD ["java", "-jar", "/usr/local/tomcat/webapps/students-task-0.0.1-SNAPSHOT.jar"]

# postman collection  https://api.postman.com/collections/7925089-c5844db2-de3b-411e-ad81-f24e3555cea1?access_key=PMAT-01HH5AS1N5JD0C523092A1K9EK