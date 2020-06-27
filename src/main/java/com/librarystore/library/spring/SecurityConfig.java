package com.librarystore.library.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    // Temporarily disable security
    @Override
    protected void configure(HttpSecurity auth) throws Exception {
        auth.authorizeRequests()
                .antMatchers("/**").permitAll()
                .and()
                .csrf().disable();
    }
}
