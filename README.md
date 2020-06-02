# spring-cloud-gateway
spring cloud api gateway 

# to run all the services
cd service1
mvn spring-boot:run
cd service2
mvn spring-boot:run
cd gateway
mvn spring-boot:run

# for testing 
# according to the route configuration this should work
http://localhost:8080/employee/message
http://localhost:8080/consumer/message

# individual instance url which won't be exposed to the outside world
http://localhost:8081/employee/message
http://localhost:8082/consumer/message
