package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.config.annotation.web.server.EnableSpringWebSession;
import org.springframework.session.web.http.CookieSerializer;
import org.springframework.session.web.http.DefaultCookieSerializer;

@Configuration
@EnableSpringWebSession
public class MyConfig {

    @Bean
    public CookieSerializer myCookieSerializer() {
        final DefaultCookieSerializer serializer = new DefaultCookieSerializer();
        serializer.setCookieName("MYSESSIONID");
        serializer.setUseSecureCookie(true);
        serializer.setUseHttpOnlyCookie(true);
        return serializer;
    }
}