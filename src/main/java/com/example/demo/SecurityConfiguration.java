//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import javax.sql.DataSource;
//
///*
// Spring security with JDBC and h2 data base
// */
//@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//
//    @Autowired
//    DataSource dataSource;
//
//        // for authentication using in memory. When application is started it tells spring that these are the users that are allowed
//        //    @Override
//        //    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        //        auth.inMemoryAuthentication().withUser("sathwik").password("sathwik").roles("USER").and().withUser("rohini").password("rohini").roles("USER").and().withUser("neeha").password("neeha").roles("ADMIN");
//        //    }
//
//
//    /*
//      For authentication using data base and JDBC. When application is started this tells spring to populate
//      database with the below details. We can also take out the schema creation from here and create a file schema.sql
//      file in resources which will have queries to create tables and add users
//     */
////    @Override
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth.jdbcAuthentication().dataSource(dataSource).withDefaultSchema().withUser(
////                User.withUsername("Sathwik").password("sathwik").roles("USER")
////        ).withUser(
////                User.withUsername("rohini").password("rohini").roles("ADMIN")
////        );
////    }
//
//
//    // This is to authorize the users
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().antMatchers("/user").hasRole("USER").antMatchers("/admin").hasRole("ADMIN").antMatchers("/**").permitAll().and().formLogin();
//    }
//
//    // we need some password encoder to maintain safety
//    @Bean
//    public PasswordEncoder getPasswordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//    }
//}
