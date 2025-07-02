package com.project.servicedeck.global.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers(
                                "/swagger-ui/**",
                                "/v3/api-docs/**",
                                "/api/test"
                        ).permitAll()
                        .anyRequest().permitAll()
                )
                .csrf(csrf -> csrf.disable())  // 람다식
                .formLogin(form -> form.disable()) // 람다식
                .build();
    }
}

