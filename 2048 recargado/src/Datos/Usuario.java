package Datos;

public class Usuario {
	//atributos
	private String nombre;
	private R�cordU records;
	//atributos
	
	//constructor
	public Usuario(String nom) {
		this.setNombre(nom);
		this.setRecords(cogerDatosRecord());
	}
	//constructor

	//set y get
	public void setNombre(String nom) {
	this.nombre=nom;
	}
	public void setRecords(R�cordU rec) {
		this.records=rec;
	}
	public String getNombre() {
		return this.nombre;
	}
	public R�cordU getRecords() {
		return this.records;
	}
	//set y get

	
	private R�cordU cogerDatosRecord() {
		//COMPLETAR, REVISA SI EL JUGADOR TIENE DATOS DE RECORD GUARDADOS EN EL COMPUTADOR, SI NO CREA NUEVO
		return null;
	}
	
	@Override
	public String toString() {
		//COMPLETAR
		return null;
	}
}
