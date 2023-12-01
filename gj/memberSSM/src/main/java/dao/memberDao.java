package dao;

import java.util.List;

import vo.member;

public interface memberDao {
	//create	
	void add(member m);
	
	//read
	
	List<member> queryAll();
	
	member queryId(int id);
	
	//update
	void update(member m);
	
	//delete
	void delete(int id);

}