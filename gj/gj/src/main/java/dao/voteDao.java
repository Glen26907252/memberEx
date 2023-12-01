package dao;

import java.util.List;

import entity.vote;

public interface voteDao {
		//Read
		List<vote> qrueryAll();
		vote queryTeacherno(String teachno);
		
		//update
		void update(vote v);

}
