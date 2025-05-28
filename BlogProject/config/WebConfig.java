package com.blog.BlogProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // Allows all paths
                .allowedOrigins("http://localhost:5173")  // React app URL
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Methods you allow
                .allowCredentials(true);  // Optional: allow sending credentials (cookies, etc.)
    }
}