package factory;

import dao.memberDaoImpl;
import vo.member;

public class F1 {
	private member m;
	private memberDaoImpl md;
	
	
	public F1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public F1(member m, memberDaoImpl md) {
		super();
		this.m = m;
		this.md = md;
	}


	public member getM() {
		return m;
	}
	public void setM(member m) {
		this.m = m;
	}
	public memberDaoImpl getMd() {
		return md;
	}
	public void setMd(memberDaoImpl md) {
		this.md = md;
	}
	

}