package Datos;

public class Número {
	//atributos
	private int valor, vecesJugadas;
	private int[] posición;
	private boolean mezclable, vacía, desaparece;
	//atributos
	
	//constructor
	public Número (int vez, int[] pos) {
		this.vecesJugadas=vez;
		this.posición=pos;
		this.mezclable=false;
		this.desaparece=false;
	}
	//constructor
	
	//set y get
	public void setVecesJugadas(int veces) {
		this.vecesJugadas=veces;
		this.valor=2^(this.vecesJugadas);
		if (this.valor==1) {
			this.vacía=true;
		}else {
			this.vacía=false;
		}
	}
	public void setPosición(int[] coor) {
		try {
		this.posición=coor;
		}catch(Exception e) {
			System.out.println("dimensión de coor no corresponde a la del atributo posición de Número");
		}
	}
	public void setMezclable(boolean mez) {
		this.mezclable=mez;
	}
	public void setDesaparece(boolean des) {
		this.mezclable=des;
	}
	
	public int getValor() {
		return this.valor;
	}
	public int[] getPosición() {
		return this.posición;
	}
	public boolean getMezclabe() {
		return this.mezclable;
	}
	public boolean getVacía() {
		return this.vacía;
	}
	public boolean getDesaparece() {
		return this.desaparece;
	}
	
	//set y get

}
