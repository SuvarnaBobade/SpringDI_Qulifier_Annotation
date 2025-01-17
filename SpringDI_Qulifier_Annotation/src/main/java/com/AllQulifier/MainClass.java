package com.AllQulifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext contex = new AnnotationConfigApplicationContext(MyConfigureClass.class);
		Person p=contex.getBean(Person.class);
		System.out.println(p.getSmi1().calling());
		System.out.println(p.getSmi2().calling());
		
		
	}

}
