package com.mvc.treeapp.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class SpringConfig extends WebMvcConfigurationSupport {

        @Bean
        public ModelMapper modelMapper(){
            return new ModelMapper();
        }

        @Bean
        public PasswordEncoder passwordEncoder(){
            return NoOpPasswordEncoder.getInstance();
    }

}
