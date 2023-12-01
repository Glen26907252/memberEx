package factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import vo.member;
import dao.memberDaoImpl;

@Configuration
public class fm {
	@Bean("m")
	public member getM()
	{
		return new member();
	}
	
	@Bean("md")
	public memberDaoImpl getMd()
	{
		return new memberDaoImpl();
	}
	
	@Bean("f")
	public F1 getF()
	{
		F1 f=new F1(getM(),getMd());
		
		return f;
	}

}