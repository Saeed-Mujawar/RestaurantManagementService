<h1 align="center"> 
Restaurant Management Service</h1>



>### Prerequisites
  MySql

SpringBoot

Java


>### Data flow
 The application is built using the SpringBoot framework and consists of four layers: DTO, model, service, and repository.-

* **DTO** -The DTO layer consists of classes that are used to transfer data between different layers of the application
* **Controller** - The controller layer handles the HTTP requests, translates the JSON parameter to object, and authenticates the request and transfer it to the business (service) layer. In short, it consists of views i.e., frontend part.
* **Service** -The business layer handles all the business logic. It consists of service classes and uses services provided by data access layers.
* **Repository** - This layer mainatains the h2-database thing on which CRUD operations are performed
* **Model** - This layer consists basically the class level things- the various classes required for the project and these classes consists the attributes to be stored.
* Tech stack used: Spring Boot, Hibernate, MySQL, OOPs, Postman and Java

>### API Documentation
The API endpoints will be available at http://localhost:8080.

#### Endpoints
Restaurant-controller
* GET
-/restaurants/{id}

* PUT
-/restaurants/{id}

* DELETE
-/restaurants/{id}

* GET
-/restaurants

* POST
-/restaurants

Restaurant-management-controller

* PUT-/restaurantmanagement/restaurantid/{restaurantEmployeeRecordId}

* GET-/restaurantmanagement/restaurantid/{restaurantid}

User-controller

* POST
-/user/signup

* POST-
/user/signin

* GET-
/user/food

>### Schemas
Food

* id

* foodName	

* foodPrice

* Restaurant	Restaurant

Restaurant

* RestaurantId	

* RestaurantName

* RestaurantAddress

* Menu

* PersonalDetails	

RestaurantManagement

* RestaurantManagementRecordId

* RestaurantDescription

* RestaurantHeadChefName

* RestaurantHeadChefSalary

* RestaurantStaffsNumber

* RestaurantStaffTotalExpense

* Restaurant	Restaurant

SignUpInput

* userFirstName	

SignUpOutput

* status

* message

SignInInput

* userEmail	
* serPassword

SignInOutput

* status	
* token	



>### Project Summary
This application has a well-defined architecture with clear separation of concerns. Each layer has its own set of responsibilities and communicates with other layers in a decoupled way. This makes the application modular and easy to maintain.
