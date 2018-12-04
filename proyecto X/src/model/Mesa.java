package model;

public class Mesa {
	private String idMesa;
	private int numeromesa;
	private int numerosillas;
	private int estado;
	public Mesa(String idMesa, int numeromesa, int numerosillas, int estado) {
		super();
		this.idMesa = idMesa;
		this.numeromesa = numeromesa;
		this.numerosillas = numerosillas;
		this.estado = estado;
	}
	public Mesa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mesa(String idMesa, int numeromesa, int numerosillas) {
		super();
		this.idMesa = idMesa;
		this.numeromesa = numeromesa;
		this.numerosillas = numerosillas;
	}
	
	public Mesa(int numeromesa) {
		super();
		this.numeromesa = numeromesa;
	}
	public String getIdMesa() {
		return idMesa;
	}
	public void setIdMesa(String idMesa) {
		this.idMesa = idMesa;
	}
	public int getNumeromesa() {
		return numeromesa;
	}
	public void setNumeromesa(int numeromesa) {
		this.numeromesa = numeromesa;
	}
	public int getNumerosillas() {
		return numerosillas;
	}
	public void setNumerosillas(int numerosillas) {
		this.numerosillas = numerosillas;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public String toString(){
		return this.numeromesa+"";
	}
	
}
