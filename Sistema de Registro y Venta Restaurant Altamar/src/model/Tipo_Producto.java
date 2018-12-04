package model;

public class Tipo_Producto {
	
	private int id;
	private String nombre;
	
	
	public Tipo_Producto(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public Tipo_Producto(String nombre) {
		super();
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String toString(){
		return this.nombre;
	}
	

}
