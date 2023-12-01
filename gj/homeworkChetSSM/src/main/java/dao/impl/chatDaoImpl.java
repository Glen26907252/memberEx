package dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.transaction.Transaction;
import org.apache.ibatis.transaction.TransactionFactory;

import dao.DbConnection;
import dao.chatDao;
import vo.chat;

public class chatDaoImpl implements chatDao{

	public static void main(String[] args) {
		

	}

	@Override
	public void add(chat c) {
		SqlSession se=DbConnection.getDb();
		se.insert("addChat", c);
		se.commit();
		
	}

	@Override
	public List<chat> queryAll() {
		SqlSession se=DbConnection.getDb();
		List<chat> l=se.selectList("selectAll", chat.class);
		return l;
	}

	@Override
	public void update(chat c) {
		// TODO Auto-generated method stub
		
	}

}
