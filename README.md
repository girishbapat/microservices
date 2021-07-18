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
<b>4.0- Config Server-</b> Here we have first created new repository https://github.com/girishbapat/config-server, which will be<br> used to refer as configuration server for other projects in our current <br> repository.<br> Now, we need following: <br>
<td> 1. To add common configurations, in this newly created repository in <br> application.yml file. </td> <br> 
<td>2. In cloud-config-server project, add @EnableConfigServer annotation and <br>
refer to above repository.</td> <br>
<td>3. Remove the common configurations which we have added in above repository <br> from all the other projects.</td> <br>
<td>4. We would need to add bootstrap.yml in other microservices than cloud-config-server <br> to specify that cloud config is enabled through cloud-config-server. </td> <br>
<td>5. Need to add respective dependencies in pom.xml files for all those projects. </td> <br>







