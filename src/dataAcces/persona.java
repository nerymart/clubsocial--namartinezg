package dataAcces;

import java.util.TimeZone;

public class persona {
	private String nombre;
	private String sexo;
	private int fechaNacimiento;
	private int numeroEmpleado;
    private String puestoT;
	public persona(String nombre, String sexo, int fechaNacimiento, int numeroEmpleado, String puestoT) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.numeroEmpleado = numeroEmpleado;
		this.puestoT = puestoT;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}
	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	public String getPuestoT() {
		return puestoT;
	}
	public void setPuestoT(String puestoT) {
		this.puestoT = puestoT;
	}


}
