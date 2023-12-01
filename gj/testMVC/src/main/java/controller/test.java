package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class test {
	@GetMapping("A")
	public String getA()
	{
		return "A";
	}
	
	@PostMapping("login")
	public String login(String username,String password)
	{
		if(username.equals("abc")&& password.equals("123"))
		{
			return "loginSuccess";
		}
		else
		{
			return "loginError";
		}
	}

}