package com.mayikt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan({"com.mayikt.controller","com.mayikt.config"})
public class SpringMVCConfig {
}
