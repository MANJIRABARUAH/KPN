#This codebase is created to demonstrate a spring boot application that handles the request '/api/yourapp/v1/person/id/{id}'. This application contains configuration that has a person id, person name and person age. When a request comes in fetch the matching name and age and return these values in xml format based on 'person.xsd'.

#How it works
The application uses Spring boot (Web) and h2 database.

All the endpoints will be in controller part followed with services for business logic and used custom repository of jdbc for crud operations on h2 database.

In order to do the xsd validation, I have overwritten the xsd schema and dumped it to a model class with help of Jaxb maven plugin.

All the validations and behaviour of the xsd will be performed by model class.

#Repository
I have mocked h2 database with few persons which contains id , name and age. When end user will search a record via ID, the respective name and age will be fetched and will bind it to the model class.

#Exception handling
I haven't created any manual exception and I have used controller advice to customise the exception.
Example: when we will fetch a record with no id present in the repository, then jdbc will throw an exception of type EmptyResultDataAccessException. Controller advice will catch that exception and throw to the end user by overriding custom message.

#Database
It uses a H2 in memory database (for now), can be changed easily in the application.properties for any other database.


#swagger endpoint
http://localhost:8080/swagger-ui.html#/

#postman request endpoint
http://localhost:8080/api/v1/person/id/{id}