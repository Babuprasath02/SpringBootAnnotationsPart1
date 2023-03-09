package com.kgisl.revise.componentExample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QualifierClass implements QualifierAnno{

    @Override
    public String nonVegPizza() {
       return "Non-Pizza";
    }
    
}
