package model;

public class Tipo_Bebidas {
	private int idBebida;
	private String nomBebida;
	public Tipo_Bebidas(int idBebida, String nomBebida) {
		super();
		this.idBebida = idBebida;
		this.nomBebida = nomBebida;
	}
	public int getIdBebida() {
		return idBebida;
	}
	public void setIdBebida(int idBebida) {
		this.idBebida = idBebida;
	}
	public String getNomBebida() {
		return nomBebida;
	}
	public void setNomBebida(String nomBebida) {
		this.nomBebida = nomBebida;
	}
	
	

}
