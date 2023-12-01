package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import CA.A;
import factory.product1;


public class test1 {

	public static void main(String[] args) {
		ApplicationContext a1=new ClassPathXmlApplicationContext("p1.xml");
		
		product1 f1=a1.getBean("pr1", product1.class);
		
		for(A a:f1.getA())
		{
			System.out.println(a.hello());
		}
		

	}

}