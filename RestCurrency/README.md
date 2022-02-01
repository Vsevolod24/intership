Simple REST application

REST application that provides REST API.

Run rest service 

Database configuration

1. Create database restdemo
Predefined username - sa
Predefined password - sa

Change in properties if required

spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/restdemo?createDatabaseIfNotExist=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver


2. git clone 

3. mvn spring-boot:run

What wasn't include: spring security
