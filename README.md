# Spring-Seurity
- The first step to bring security to the spring project is adding " spring boot security". This will add a login page that take "user" as username, and the password is provided in the console when your Spring Boot project is starting. 
- To be able to add the proper username and password, we need to add configuration class that inherits from WebSecurityConfigurerAdapter. As this is a configuration class we need to add:  
        @Configuration <br />
        @EnableWebSecurity<br />
    There are two ways to provides user and password:
    - override UserDetailsService, which requires using withDefaultPasswordEncoder() that is a deprecated method, and you will be exposing the password.
    - using PasswordEncoder which BCrypt the password.
    <br />for demo purpose I kept both code.
    
    
we can also add user password into application.properties but this will not be valid as long as the configuration class exist. 
