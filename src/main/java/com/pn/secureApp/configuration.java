//package com.pn.secureApp;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Configuration
//@EnableWebSecurity
//public class configuration extends WebSecurityConfigurerAdapter {
//    // use secret to login
//    private static final String ENCODED_PASSWORD = "$2a$10$eyRbDkXVOFBdstIXp2CCBuIhOgtrfdcQXF2buoUJjuO8oKT0ZEZ4K";
//
////    @Bean
////    @Override
////    protected UserDetailsService userDetailsService() {
////        List<UserDetails> users = new ArrayList<>();
////        users.add(User.withDefaultPasswordEncoder().username("parisa").password("1234").roles("ADMIN").build());
////        return new InMemoryUserDetailsManager(users);
////    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .passwordEncoder(passwordEncoder())
//                .withUser("parisa")
//                .password(ENCODED_PASSWORD)
////                .password(passwordEncoder().encode("1234"))  // To pass decrypted password
//                .roles("ADMIN");
//    }
//
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
