package model;


public class Cliente {
	private int id;
	private String codigo;
	private int DNI;
	private String nombre;
	private String Apellido;
	private int Telefono;
	private int mesa;
	private int estado;
	
	public Cliente(String codigo, int dNI, String nombre, String apellido, int telefono, int mesa, int estado) {
		super();
		this.codigo = codigo;
		DNI = dNI;
		this.nombre = nombre;
		Apellido = apellido;
		Telefono = telefono;
		this.mesa = mesa;
		this.estado = estado;
	}
	
	
	public Cliente(String codigo) {
		super();
		this.codigo = codigo;
	}


	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public int getTelefono() {
		return Telefono;
	}
	public void setTelefono(int telefono) {
		Telefono = telefono;
	}
	public int getMesa() {
		return mesa;
	}
	public void setMesa(int mesa) {
		this.mesa = mesa;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
	
}
