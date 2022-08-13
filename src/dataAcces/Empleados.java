package dataAcces;

import java.util.Scanner;

import javax.xml.crypto.Data;

import Lista.ListaEmpleado;

public class Empleados {
	private int numEmpleado;
	private Data fechaIngreso;
	private String puestoTrabajo;
	public Empleados(int numEmpleado, Data fechaIngreso, String puestoTrabajo) {
		super();
		this.numEmpleado = numEmpleado;
		this.fechaIngreso = fechaIngreso;
		this.puestoTrabajo = puestoTrabajo;
	}
	public int getNumEmpleado() {
		return numEmpleado;
	}
	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}
	public Data getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Data fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getPuestoTrabajo() {
		return puestoTrabajo;
	}
	public void setPuestoTrabajo(String puestoTrabajo) {
		this.puestoTrabajo = puestoTrabajo;
	}
	
	
	
	

}
