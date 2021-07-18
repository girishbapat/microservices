"# microservices" 
Project showcasing different micro-services related functionalities. <br>
Version history<br>
Initial versions. Project creation <br>
<b>1.0- Basic microservices implementation-</b> In this version, one <br>micro-service consuming data from other micro-service. <br>
In this example, user micro-service is dependent on department micro-service <br>
and pulling details using resttemplate.<br>
<b>2.0- Eureka Server-</b> In this version, we have added, Eureka server.<br>
All the micro-services, register themselves with Eureka server.<br>
Also while department micro-service is getting consumed in user micro-service <br>
via. application name rather than earlier hostname and port.<br>
<b>3.0- API Gateway-</b> All the requests coming from outside world will come to <br>
API Gateway first and then based on url pattern it will go to particular micro-services. <br>
All the external world traffic will go through API gateway port.<br>
In this example we are using port 9191 port for API gateway. department service <br>
and user service are using 9001 and 9002 ports; however all the requests now <br>
will get accessed with 9191 port and internally API gateway will route it to <br>
particular micro-service depending upon rules we mention in application.yaml file <br>
with predicates.<br>
<b>4.0- Config Server- Here we will first create new project in the current <br> repository which will be used to refer as configuration server for other <br> repositories.<br>




