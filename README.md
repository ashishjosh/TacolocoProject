# TacoLocoJavaChallenge using Spring Boot and REST API
This is a maven project developed using Spring Boot with. A RESTful web service which takes the item and quantities ordered as input and display the total order as response.
If any customer order 4 or more Tacos, then 20% discount will be offered from total order.
 
**Requirements For Running Application**

For building and running the application, spring boot project with embedded tomcat server(default port 8080) and following tools has been used.
1. JDK 1.8+
2. Maven
3. H2(in memory database)
4. JUnit4
5. IntelliJ Idea, STS/Eclipse also works
5. Postman for request and response
Need to add the maven dependency for  Spring Web, H2, JUnit4, Mockito, lombok(for removing boiler plate code) 

**Running the application Locally**

There are several ways to run SpringBoot Application. One way is to run the main method in com.detroitlabs.tacolocojavachallenge from your IDE
1. Download the zip file or clone the Git repository.
2. Unzip the zip file (if you downloaded one)
3. Open Command Prompt and Change directory (cd) to folder containing pom.xml
4. Open IntelliJ Idea or any other IDE
5. File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
6. Select the project
7. Choose the Spring Boot Application file (search for @SpringBootApplication)
8. Right Click on the file and Run as Java Application
9. Right Click on the test class and run with coverage to gain full information with test cases

Alternatively, SpringBoot maven plugin could be used as:
$ git clone https://github.com/ashishjosh/TacolocoProject.git
$ cd tacolocojavachallenge
$ mvn spring-boot:run

**Running the application with Executable JAR**

The code can be built into a jar & then executed/run. 
Once the jar is built, run the jar by double clicking on it or by using the command

$ git clone https://github.com/ashishjosh/TacolocoProject.git
$ cd tacolocojavachallenge
$ mvn package -DskipTests
$ java -jar target/SBtemplate-0.0.1-SNAPSHOT.jar --spring.profiles.active=test

**Accessing Data in H2 Database**

URL to access H2 console: http://localhost:8081/h2-console
(http://localhost:8081/h2-console/login.jsp?jsessionid=96f076c1721dc38db907bdc41570b41e)
1. Saved Settings: Generic H2 (Embedded)
2. Setting Name: Generic H2 (Embedded)
3. Driver class: org.h2.Driver
4. JDBC URL: jdbc:h2:mem:h2db
5. User Name: sa
6. Password:
You can access the database table with connect button and write specific query
The table is created on the basis of information about item and price of tacos in run method of Spring boot application

**Properties**

server.port=8081
**h2-datasource configuration**
spring.datasource.url=jdbc:h2:mem:h2db
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=create
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

**Testing API(GET ony as per the requirement)**

**Testing using Postman as client for RESTful API**

Testing with Maven
Run only unit tests:
$ mvn clean test

Steps for response through postman client 

1. Use GET method in Postman
2. http://localhost:8081/request/totalAmount
3. Hit the Send button

**Sample Request Format:Valid JSON Format**

I have used the format as per the requirement of my application
[{
    "name": "Beef Taco",
    "quantity":2
},

{
    "name": "Chorizo Taco",
    "quantity":2
},
{
"name":"Chicken Taco",
"quantity":3
}
]
**Sample Response Format: Valid JSON format**

 {
     "orderRequestList": [
         {
             "name": "Beef Taco",
             "quantity": 2
         },
         {
             "name": "Chorizo Taco",
             "quantity": 2
         },
         {
             "name": "Chicken Taco",
             "quantity": 3
         }
     ],
     "subTotal": 22.0,
     "discount": 4.4,
     "totalPrice": 22.0
 }
 Note: The amount represents the total price in dollars($), 
 which could be designed at front end
 
**Documentation**
 
1. Postman Collection - online, with code auto-generated snippets
2. Postman Collection for offline testing is available in the postman folder.
3. Swagger - http://localhost:8081/swagger-ui.html- Documentation & Testing. I have used Swagger in config package for API documentation. 

**Screenshots of Project**

***The End***

I hope you enjoyed the application and find it useful with full implementation, I end up here with project for Tacos ordering through mobile phone 
using Spring Boot and REST API. I have fully implemented the project with GET method with all the test cases passed as per the requirement of application.  

**Happy Coding**


