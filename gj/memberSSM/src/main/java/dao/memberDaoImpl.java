package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.member;

public class memberDaoImpl implements memberDao{

	public static void main(String[] args) {
		//System.out.println(new memberDaoImpl().queryAll());
		List<member> l=new memberDaoImpl().queryAll();
		
		for(member m:l)
		{
			System.out.println(m.getId()+"\t"+m.getName());
		}
		
//		member m=new memberDaoImpl().queryId(1);
//		//System.out.println(m.getId()+"\t" + m.getName());
//		m.setPassword("00000000");
//		m.setName("test");
//		
//		new memberDaoImpl().update(m);
		
		//new memberDaoImpl().delete(1);
		
	}

	@Override
	public void add(member m) {
		SqlSession se=DbConnection.getDb();		
		se.insert("addMember", m);
		se.commit();
		se.close();
		
		
	}

	@Override
	public List<member> queryAll() {
		SqlSession se=DbConnection.getDb();
		List<member> l=se.selectList("selectAllmember");
		return l;
	}
	
	@Override
	public member queryId(int id) {
		SqlSession se=DbConnection.getDb();
		member m=se.selectOne("selectByid", id);
		
		return m;
	}
	
	@Override
	public void update(member m) {
		SqlSession se=DbConnection.getDb();
		se.update("updateMember", m);
		se.commit();
		se.close();
		
	}

	@Override
	public void delete(int id) {
		SqlSession se=DbConnection.getDb();
		se.delete("deleteMember", id);
		se.commit();
		se.close();
		
	}


}