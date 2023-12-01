package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.sp1;
import factory.f1;

public class testController {

	public static void main(String[] args) {
		ApplicationContext a1=new AnnotationConfigApplicationContext(sp1.class);
		f1 f=a1.getBean("f", f1.class);
		
		System.out.println(f.getA().hello());

	}

}