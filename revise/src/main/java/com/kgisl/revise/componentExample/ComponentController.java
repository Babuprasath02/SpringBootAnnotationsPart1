package com.kgisl.revise.componentExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentController {
//Component Example
    public String pizza(){
        return "Hot Pizza";
    }


//AutowiredExample
    // @Autowired    field inject
    private AutowiredService autowiredService;

    
    //@Autowired Contstuctor inject
    public ComponentController(AutowiredService autowiredService) {
        this.autowiredService = autowiredService;
    }
    @Autowired  //setter Inject
    public void setAutowiredService(AutowiredService autowiredService) {
        this.autowiredService = autowiredService;
    }

    public String veg(){
        return autowiredService.vegPizza();
    } 

//QualifierExample

    private QualifierAnno qa;  

//     @Autowired
//     public ComponentController(@Qualifier("qualifierClass")QualifierAnno qa) {
//         this.qa = qa;
//     }

//     public String nonvegpizza(){
//         return qa.nonVegPizza();
//    }

    
//PrimaryExample
@Autowired
public ComponentController(QualifierAnno qa) {
    this.qa = qa;
}
public String  nonvegpizza(){
    return qa.nonVegPizza();
}
    
    
}
