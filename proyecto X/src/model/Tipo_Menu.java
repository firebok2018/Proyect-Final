package model;

public class Tipo_Menu {
	private int idTipo;
	private String nomTipo;
	public Tipo_Menu(int idTipo, String nomTipo) {
		super();
		this.idTipo = idTipo;
		this.nomTipo = nomTipo;
	}
	public int getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}
	public String getNomTipo() {
		return nomTipo;
	}
	public void setNomTipo(String nomTipo) {
		this.nomTipo = nomTipo;
	}
	public String toString(){
		return this.nomTipo; 
	}
}
