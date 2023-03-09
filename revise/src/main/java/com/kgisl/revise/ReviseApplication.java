package com.kgisl.revise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kgisl.revise.BeanConfig.BeanClass;
import com.kgisl.revise.componentExample.ComponentController;

@SpringBootApplication
public class ReviseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(ReviseApplication.class, args);
		ComponentController pc = context.getBean(ComponentController.class);
		System.out.println(pc.pizza());
		System.out.println(pc.veg());
		System.out.println(pc.nonvegpizza());
		BeanClass as = context.getBean(BeanClass.class);
		System.out.println(as.nonVegPizza());
	}

}
