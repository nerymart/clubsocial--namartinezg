package dataAcces;

import javax.xml.crypto.Data;

public class Miembros {
	private int numMembresia;
	private Data emisionMembresia;
	private Data venciMembrecia;
	public Miembros(int numMembresia, Data emisionMembresia, Data venciMembrecia) {
		super();
		this.numMembresia = numMembresia;
		this.emisionMembresia = emisionMembresia;
		this.venciMembrecia = venciMembrecia;
	}
	public int getNumMembresia() {
		return numMembresia;
	}
	public void setNumMembresia(int numMembresia) {
		this.numMembresia = numMembresia;
	}
	public Data getEmisionMembresia() {
		return emisionMembresia;
	}
	public void setEmisionMembresia(Data emisionMembresia) {
		this.emisionMembresia = emisionMembresia;
	}
	public Data getVenciMembrecia() {
		return venciMembrecia;
	}
	public void setVenciMembrecia(Data venciMembrecia) {
		this.venciMembrecia = venciMembrecia;
	}
	

}
