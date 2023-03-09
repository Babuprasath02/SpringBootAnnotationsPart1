package com.kgisl.revise.BeanConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.kgisl.revise.componentExample.QualifierAnno;


@Configuration
public class AppConfig {
    @Bean
    public QualifierAnno veg(){
        return new BeanClass();
    }
    
}
