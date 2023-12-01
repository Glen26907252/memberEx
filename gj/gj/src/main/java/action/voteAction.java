package action;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;

import entity.vote;
import factory.voteF1;

public class voteAction extends ActionSupport {
	private String teacherno;

	public String getTeacherno() {
		return teacherno;
	}

	public void setTeacherno(String teacherno) {
		this.teacherno = teacherno;
	}
	@Override
	public String execute() throws Exception
	{
		ApplicationContext a1=new ClassPathXmlApplicationContext("sp1.xml");
		
		voteF1 vf1=a1.getBean("votef1", voteF1.class);
		
		
		vote v=vf1.getVdi().queryTeacherno(teacherno);
		
		vf1.getVdi().update(v);
		
		return "vote";
	}

}
