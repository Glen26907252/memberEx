package dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.core.io.Resource;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DbConnection {

	public static void main(String[] args) {
		
		System.out.println(DbConnection.getDb());
	}
	
	public static SqlSession getDb()
	{
		SqlSession se=null;
		try {
			InputStream in=Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(in);
			 se=sf.openSession();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return se;
	}
	
	 

}
