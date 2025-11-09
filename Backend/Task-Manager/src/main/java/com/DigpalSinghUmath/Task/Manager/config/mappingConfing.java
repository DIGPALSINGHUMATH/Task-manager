package com.DigpalSinghUmath.Task.Manager.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class mappingConfing {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
