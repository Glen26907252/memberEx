package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import factory.FChat;
import factory.chatIOC;

public class testController {

	public static void main(String[] args) {
		ApplicationContext a1=new AnnotationConfigApplicationContext(chatIOC.class);
		FChat f=a1.getBean("FC",FChat.class);

	}

}
