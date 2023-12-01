package factory;

import dao.impl.chatDaoImpl;
import vo.chat;

public class FChat {
	private chat c;
	private chatDaoImpl cdI;
	public FChat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FChat(chat c, chatDaoImpl cdI) {
		super();
		this.c = c;
		this.cdI = cdI;
	}
	public chat getC() {
		return c;
	}
	public void setC(chat c) {
		this.c = c;
	}
	public chatDaoImpl getCdI() {
		return cdI;
	}
	public void setCdI(chatDaoImpl cdI) {
		this.cdI = cdI;
	}
	
	

}
