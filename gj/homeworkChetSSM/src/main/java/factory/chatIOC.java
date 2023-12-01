package factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dao.impl.chatDaoImpl;
import vo.chat;

@Configuration
public class chatIOC {
	@Bean(name="C")
	public chat getC()
	{
		return new chat();
	}
	
	@Bean(name="CDI")
	public chatDaoImpl getCDI()
	{
		return new chatDaoImpl();
	}
	
	@Bean(name="FC")
	public FChat getFchat()
	{
		FChat f=new FChat(getC(),getCDI());
		
		return f;
	}

}
