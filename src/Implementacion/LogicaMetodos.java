package Implementacion;

import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

import Dominio.Empleados;
import Interface.Metodos;

public class LogicaMetodos implements Metodos{
	
	//Los tipos de datos primitivos se parsean al agregar los en el hashmap
	private HashMap<Integer, Empleados> hashMapEmpleados = new HashMap<Integer, Empleados>();

	@Override
	public void guardar(Empleados empleado) {
		// TODO Auto-generated method stub
		hashMapEmpleados.put(empleado.getnumEmpleados(), empleado);
		
		
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(hashMapEmpleados);
	}

	@Override
	public Empleados buscar(int numEmpleado) {
		// TODO Auto-generated method stub
		return hashMapEmpleados.get(numEmpleado);
	}

	@Override
	public void editar(Empleados empleado) {
		// TODO Auto-generated method stub
		hashMapEmpleados.put(empleado.getnumEmpleados(), empleado);
	}

	@Override
	public void eliminar(int numEmpleado) {
		// TODO Auto-generated method stub
		hashMapEmpleados.remove(numEmpleado);
	}
	
}
