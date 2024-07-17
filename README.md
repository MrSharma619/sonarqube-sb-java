# sonarqube-sb-java

spin up a docker container for sonarqube  

command
```
docker run --name sonarqube -e SONAR_ES_BOOTSTRAP_CHECKS_DISABLE=true -p 9000:9000 sonarqube:latest
```
  

visit
```
http://localhost:9000/
```

create local project and a token with global access  
  

run this command in project directory or any other project directory (java only)  
  
```
mvn clean verify sonar:sonar -Dsonar.projectKey=<project_key> 
                             -Dsonar.projectName='<project_name>' 
                             -Dsonar.host.url=http://localhost:9000 
                             -Dsonar.token=<project_token>
```
  
you can find these details from the new project created.  
  
