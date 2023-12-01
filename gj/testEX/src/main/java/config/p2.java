package config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import CA.A;
import CB.B;
import factory.product1;

@Configuration
public class p2 {
	
	@Bean(name="a")
	public List<A> getA()
	{
		A a=new A();
		a.setName("aaa");
		
		/*List<A> l=Arrays.asList(new A(),a);*/
		
		List<A> l=new ArrayList();
		l.add(new A());
		l.add(a);
		
		return l;
	}
	
	@Bean(name="b")
	public List<B> getB()
	{
		B b=new B();
		
		
		List<B> l=Arrays.asList(b);
		
		return l;
	}
	
	
	@Bean(name="p")
	public product1 getP()
	{
		product1 p=new product1();
		p.setA(getA());
		p.setB(getB());
		
		return p;
	}

}