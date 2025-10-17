package Dominio;

public class Empleados {
	private int numEmpleados;
	private String nombre;
	private String app;
	private String apm;
	private long numCel;
	
	
	public Empleados(int numEmpleados, String nombre, String app, String apm, long numCel) {
		this.numEmpleados = numEmpleados;
		this.nombre = nombre;
		this.app = app;
		this.apm = apm;
		this.numCel = numCel;
	}
	
	
	@Override
	public String toString() {
		return "numEmpleados [numEmpleados=" + numEmpleados + ", nombre=" + nombre + ", app=" + app + ", apm=" + apm
				+ ", numCel=" + numCel + "]";
	}
	
	
	
	public int getnumEmpleados() {
		return numEmpleados;
	}
	public void setnumEmpleados(int numEmpleados) {
		this.numEmpleados = numEmpleados;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApp() {
		return app;
	}
	public void setApp(String app) {
		this.app = app;
	}
	public String getApm() {
		return apm;
	}
	public void setApm(String apm) {
		this.apm = apm;
	}
	public long getNumCel() {
		return numCel;
	}
	public void setNumCel(long numCel) {
		this.numCel = numCel;
	}
	
	
	
}
