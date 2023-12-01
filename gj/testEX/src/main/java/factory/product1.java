package factory;

import java.util.List;

import CA.A;
import CB.B;
import CC.C;

public class product1 {
	private List<A> a;
	private List<B> b;
	private C[] c;
	public product1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public product1(List<A> a, List<B> b, C[] c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public List<A> getA() {
		return a;
	}
	public void setA(List<A> a) {
		this.a = a;
	}
	public List<B> getB() {
		return b;
	}
	public void setB(List<B> b) {
		this.b = b;
	}
	public C[] getC() {
		return c;
	}
	public void setC(C[] c) {
		this.c = c;
	}
	
}