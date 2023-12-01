package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import factory.F1;
import factory.fm;
import vo.member;

@Controller
@RequestMapping("member")
public class memberController {
	static ApplicationContext a1=new AnnotationConfigApplicationContext(fm.class);
	
	@RequestMapping("add")
	public void add(String username, String password, 
			String name, String address, String phone, String mobile,
			HttpServletResponse response)
	{
		member m=new member(username,password, name, address, phone, mobile);
		F1 f=a1.getBean("f", F1.class);
		f.getMd().add(m);
		
		try {
			response.sendRedirect("../html/addSuccess.html");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@RequestMapping("A")
	public String getA()
	{
		return "A";
	}
	
	@RequestMapping("login")
	public String login(int id,HttpServletResponse response)
	{
		F1 f=a1.getBean("f", F1.class);
		
		member m=f.getMd().queryId(id);
		
		if(m!=null)
		{
			return "loginSuccess";
		}
		else
		{
			
			try {
				response.sendRedirect("../loginError.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
		}
	}
	
	
	
	

}