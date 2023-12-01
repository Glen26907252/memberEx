package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import factory.F1;
import factory.fm;

public class test {
	public static void main (String[]args) {
		ApplicationContext a1 =new AnnotationConfigApplicationContext(fm.class);
		F1 f =a1.getBean("f",F1.class);
		System.out.println(f.getM());
	}
}
