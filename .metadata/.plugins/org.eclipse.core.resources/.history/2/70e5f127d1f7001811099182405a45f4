package Arreglos;

import java.util.ArrayList;

import model.Mesa;

public class ArregloMesa {

	private ArrayList<Mesa> num;
	public ArregloMesa() {
		super();
		num = new ArrayList<>();
		
	}
	public int tamaño(){
		return num.size();
	}
	public void agregar(Mesa m){
		num.add(m);
	}
	public void eliminar(Mesa m){
		num.remove(m);
	}
	public Mesa obtener(int pos){
		return num.get(pos);
	}
	public Mesa BuscarMesa(int numero){
		Mesa m;
		for (int i = 0; i < tamaño(); i++) {
			m=obtener(i);
			if (numero==m.getNumeromesa()) {
				return m;
			}
		}
		return null;
	}
	public int NumeroMesa(){
		if (tamaño()==1) {
			return 1;
		}else
			return obtener(tamaño()-1).getNumeromesa()+1;
	}
	
	
}
