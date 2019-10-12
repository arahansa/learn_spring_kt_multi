package com.arahansa.config

import org.modelmapper.ModelMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AppContext {

    @Bean
    fun modelMapper(): ModelMapper{
        return ModelMapper()
    }
}