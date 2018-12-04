package model;

public class Previlegio {
	private int idTipo;
	private String nomPrevi;
	public Previlegio(int idTipo, String nomPrevi) {
		super();
		this.idTipo = idTipo;
		this.nomPrevi = nomPrevi;
	}
	public int getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}
	public String getNomPrevi() {
		return nomPrevi;
	}
	public void setNomPrevi(String nomPrevi) {
		this.nomPrevi = nomPrevi;
	}
	public String toString(){
		return this.nomPrevi; 
	}
	

}
