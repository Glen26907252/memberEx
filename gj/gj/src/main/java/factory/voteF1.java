package factory;

import dao.impl.voteDaoImpl;
import entity.vote;

public class voteF1 {
	private vote v;
	private voteDaoImpl vdi;
	public voteF1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public voteF1(vote v, voteDaoImpl vdi) {
		super();
		this.v = v;
		this.vdi = vdi;
	}
	public vote getV() {
		return v;
	}
	public void setV(vote v) {
		this.v = v;
	}
	public voteDaoImpl getVdi() {
		return vdi;
	}
	public void setVdi(voteDaoImpl vdi) {
		this.vdi = vdi;
	}
	

}
