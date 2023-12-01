package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import CA.A;
import config.p2;
import factory.product1;

public class test2 {

	public static void main(String[] args) {
		ApplicationContext a1=new AnnotationConfigApplicationContext(p2.class);
		product1 p=a1.getBean("p",product1.class);
		
		for(A a:p.getA())
		{
			System.out.println(a.hello());
		}

	}

}