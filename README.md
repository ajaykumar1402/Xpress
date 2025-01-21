# xpressbees

##Working process of the assignment

1. Create database xpressbees.

2. Open Spring Suite Tool 4 and create a spring starter project with the following dependencies
i. MySQL drivers
ii. Spring Dev Tools
iii. Spring Data JPA
iv. Spring Web

3. In the src/main/java create a package with the name model. In the model package create a class with file name DeliveryOrder. In the DeliveryOrder.java class enter the details required to form the table columns according to the assignment and use entity,table,id,generated value.
Generate constructor from superclass, constructor using fields, setters and getters(-selectall) and to string method from source.

4. Creating Repository. In the src/main/java create a package with the name repository. In the repo package create a interface with name DeliveryOrderRepository and add Jpa Repository while creating. 

5. In the src/main/java create a package controller and in package create DeliveryOrderController class. In the class add the @controller and add request mapping for home.

6. In the src/main/java create package service and in the package create an interface name DeliveryOrderService Interface and write the logics for the required things.

7. In the src/main/java create package service.impl to implement the service interface and in the  package create the DeliveryOrderServiceImpl.java class which implements the DeliveryOrderService Interface and use repo for saving the requriments.

8. In the interfaces add the required fields for the assignment and check the controller if all the fields are added or not. 

9. In the src/main/resoource/application.properties file add the server port number, db details, and view resolution properties.

10. Run the project and check the crud operations.

## Steps to working in your systems

1. Create the database with name xpressbees.
2. Unzip the file and run maven install check for the build success info in console.
3. Edit the Application.properties file with your db username and password.
4. Run the project and check the database for the tables.
5. Check the restapi Calls (crud operations) in postman.

