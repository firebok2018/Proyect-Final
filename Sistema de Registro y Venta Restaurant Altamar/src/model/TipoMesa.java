package model;

public class TipoMesa {
	private int idMesa;
	private String tipo;
	public TipoMesa(int idMesa, String tipo) {
		super();
		this.idMesa = idMesa;
		this.tipo = tipo;
	}
	public int getIdMesa() {
		return idMesa;
	}
	public void setIdMesa(int idMesa) {
		this.idMesa = idMesa;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String toString(){
		return this.tipo;
	}
	

}
