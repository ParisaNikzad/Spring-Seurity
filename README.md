# Spring-Seurity
- The first step to bring security to the spring project is adding " spring boot security". This will add a login page that take "user" as username, and the password is provided in the console when your Spring Boot project is starting. 
- To be able to add the proper username and password, we need to add configuration class that inherits from WebSecurityConfigurerAdapter. As this is a configuration class we need to add:  
    @Configuration 
    and 
    @EnableWebSecurity
    there are two ways to do that:
    - override UserDetailsService.
    
