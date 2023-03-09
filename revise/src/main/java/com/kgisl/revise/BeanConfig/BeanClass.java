package com.kgisl.revise.BeanConfig;

import com.kgisl.revise.componentExample.QualifierAnno;

public class BeanClass implements QualifierAnno{

    @Override
    public String nonVegPizza() {
        return "Bean Config Class";
    }
    
}
