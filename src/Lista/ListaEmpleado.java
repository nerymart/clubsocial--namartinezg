package Lista;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.xml.crypto.Data;

import dataAcces.persona;

public class ListaEmpleado extends persona{


		
public ListaEmpleado(String nombre, String sexo, int fechaNacimiento, int numeroEmpleado, String puestoT) {
		super(nombre, sexo, fechaNacimiento, numeroEmpleado, puestoT);
		// TODO Auto-generated constructor stub
	}
Date fechaAt = new Date();


public static  SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/YYYY");
public static Calendar calendar = new GregorianCalendar();
    
public static String DateAString(Date fecha) {
	return sdf.format(fecha);
	
}



       Date  fecha= getDateCalendar();
       String fechaCadena = DateAString(fecha);



public void cargarFecha (int dia, int mes, int año) {
	calendar.set(dia, mes, año);
	

}
public static Date getDateCalendar() {
	return calendar.getTime();
}
public void  lisG () {

	Scanner entrada = new Scanner(System.in);
	Scanner dt= new Scanner(System.in);
	

	
		System.out.println("Bienveenido a la seccion de rejistro por favor ingrese los datos correspondientes");
		System.out.println("Nombre completo");
		String nombre=entrada.nextLine();
		System.out.println("Genero");
		String sexo = entrada.nextLine();
		System.out.println("Fecha de nacimiento");
		int dia,mes,año = entrada.nextInt();
		System.out.println("Codigo ");
		int numeroEmpleado = entrada.nextInt(); 
		System.out.println( "Puesto de trabajo");
		String puestoT = dt.nextLine();
	
		ListaEmpleado we = new ListaEmpleado(nombre, sexo, numeroEmpleado,0, puestoT);
		we.setNombre(nombre);
		we.setSexo(sexo);
		we.setNumeroEmpleado(numeroEmpleado);
		we.setPuestoT(puestoT);	
	

ArrayList<persona> lista = new ArrayList<persona>();
	
	persona guardar= new persona(nombre,sexo, numeroEmpleado, 0, puestoT);
	lista.add(guardar);

	
	for(persona aux : lista) {
		System.out.println("********************************** Datos empleado ************************************ ");
		System.out.println("Nombre :"+aux.getNombre()+ "\nGenero :"+aux.getSexo()+"\nFecha de nacimiento :"+ fechaCadena+
	"\nEdad :" +"\nCodigo de empleado :"+aux.getNumeroEmpleado()+"\nPuesto de trabajo :"+aux.getPuestoT());
		
		
	}
	
}

	
}
