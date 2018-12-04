package model;

public class Producto {
	private String Codigo;
	private String Nombre;
	private	int Tipo;
	private int Stock;
	private double Precio;
	public Producto(String codigo, String nombre, int tipo, int stock, double precio) {
		super();
		Codigo = codigo;
		Nombre = nombre;
		Tipo = tipo;
		Stock = stock;
		Precio = precio;
	}
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Producto(String nombre) {
		super();
		Nombre = nombre;
	}

	

	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getTipo() {
		return Tipo;
	}
	public void setTipo(int tipo) {
		Tipo = tipo;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public String toString(){
		return this.Nombre;
	}
	
}
