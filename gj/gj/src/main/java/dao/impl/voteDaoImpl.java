package dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import dao.DbConnection;
import dao.voteDao;
import entity.vote;

public class voteDaoImpl implements voteDao{

	public static void main(String[] args) {
		/*List<vote> l =new voteDaoImpl().qrueryAll();
		for(vote v:l) {
			System.out.println(v.getTeacherno()+"\t"+v.getTeachername()+"\t"+v.getVote());
		}*/
		
		/*vote v=new voteDaoImpl().queryTeacherno("t04");
		new voteDaoImpl().update(v);*/
				
	}

	@Override
	public List<vote> qrueryAll() {
		Session session=DbConnection.getDb();
		String SQL="select * from vote";
		Query q=session.createNativeQuery(SQL,vote.class);
		List<vote> l=q.getResultList();
		
		
		return l;
	}

	@Override
	public vote queryTeacherno(String teacherno) {
		Session session=DbConnection.getDb();
		String SQL="select * from vote where teacherno=?1";
		Query q=session.createNativeQuery(SQL,vote.class);
		q.setParameter(1, teacherno);
		
		vote v=(vote) q.uniqueResult();
		
		return v;
	}

	@Override
	public void update(vote v) {
		Session se=DbConnection.getDb();
		Transaction t=se.beginTransaction();
		v.setVote(v.getVote()+1);
		se.update(v);
		t.commit();
		se.close();
		
	}

}
