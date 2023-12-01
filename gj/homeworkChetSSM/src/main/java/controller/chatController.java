package controller;

import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import factory.chatIOC;
import vo.chat;
import factory.FChat;
@Controller
public class chatController {
	static ApplicationContext a1=new AnnotationConfigApplicationContext(chatIOC.class);
	
	//login登入觀看留言	
	@RequestMapping("login")
	public String login(String name,HttpSession session)
	{
		session.setAttribute("Name", name);
		
		
		
		
		return "chat";
	}
	
	
	//留言
	@RequestMapping("addChat")
	public String get()
	{
		return "addChat";
	}
	@RequestMapping("finish")
	public String addChat(String subject,String content,HttpSession session)
	{
		FChat f=a1.getBean("FC", FChat.class);
		String Name=session.getAttribute("Name").toString();
		
		f.getCdI().add(new chat(Name,subject,content));
		
		return "chat";
	}
	
	//登出
	
	public void logout()
	{
		
	}
	

}
