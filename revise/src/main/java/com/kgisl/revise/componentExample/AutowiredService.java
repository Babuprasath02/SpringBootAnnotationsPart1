package com.kgisl.revise.componentExample;


import org.springframework.stereotype.Component;

@Component
// @Primary
public class AutowiredService implements QualifierAnno{

    public String vegPizza(){
        return "Hot Veg Pizza";
    }

    @Override
    public String nonVegPizza() {
       return "Veg-Pizza";
    }
    
}
