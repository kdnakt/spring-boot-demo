package com.example.demo.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class MySecurity extends WebSecurityConfigurerAdapter{

    @Override
    public void configure(final HttpSecurity http) throws Exception {
        http.formLogin()
            .loginProcessingUrl("/login")
            //.usernameParameter("u").passwordParameter("p")
            ;
    }

    @Override
    public void configure(final AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
            .withUser("1").password("a");
    }
}