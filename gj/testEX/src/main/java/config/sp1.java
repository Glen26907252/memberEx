package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import CA.A;
import CB.B;
import CC.C;
import factory.f1;

//sp1.xml-->換成標籤Annotaion
@Configuration
public class sp1 {
	
	@Bean(name="a")//<bean id="a">
	public A getA()//<class="CA.A">
	{
		return new A();
	}
	
	
	@Bean(name="b")
	public B getB()
	{
		return new B();
	}

	@Bean(name="c")
	public C getC()
	{
		return new C();
	}
	
	@Bean(name="f")//<bean id="f" 
	public f1 getF1()//class="factory.f1" autowire="byName"></bean>
	{
		f1 f=new f1(getA(),getB(),getC());
		
		return f;
	}
}