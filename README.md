# spring-cloud-feign-demo
Two services registered with eureka, using feign call each other, with zuul as a gateway

The purpose of this demo is to use have two services able to call each other without hard-coding their location in code.  

To do this:  
* Create a Eureka server  
* Create first service, register with eureka
* Create second service, register with eureka  
* Create a feign client in first service, to call second service  
* Create a feign client in second service, to call first service  
* (Optional) Create a zuul gateway, so the brower/client only calls one host


This is a multiproject... project  
eurekaserver - Eureka server demo  
eurekafeign-firstservice - First service demo  
eurekafeign-gateway - Zuul gateway demo  
eurekafeign-secondservice - Second service demo 


Open each project, run the project, go to the following urls to test:  
http://localhost:8761/  -- See eureka with all of the instances running  
http://localhost:8765/api/firstservice/querySecondService?name=John -- Using the feign client in first service to call second service  
http://localhost:8765/api/secondservice/queryFirstService?name=John -- Using the feign client in second service to call first service  



