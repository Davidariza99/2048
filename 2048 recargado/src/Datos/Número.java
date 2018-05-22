package Datos;

public class N�mero {
	//atributos
	private int valor, vecesJugadas;
	private int[] posici�n;
	private boolean mezclable, vac�a, desaparece;
	//atributos
	
	//constructor
	public N�mero (int vez, int[] pos) {
		this.vecesJugadas=vez;
		this.posici�n=pos;
		this.mezclable=false;
		this.desaparece=false;
	}
	//constructor
	
	//set y get
	public void setVecesJugadas(int veces) {
		this.vecesJugadas=veces;
		this.valor=2^(this.vecesJugadas);
		if (this.valor==1) {
			this.vac�a=true;
		}else {
			this.vac�a=false;
		}
	}
	public void setPosici�n(int[] coor) {
		try {
		this.posici�n=coor;
		}catch(Exception e) {
			System.out.println("dimensi�n de coor no corresponde a la del atributo posici�n de N�mero");
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
	public int[] getPosici�n() {
		return this.posici�n;
	}
	public boolean getMezclabe() {
		return this.mezclable;
	}
	public boolean getVac�a() {
		return this.vac�a;
	}
	public boolean getDesaparece() {
		return this.desaparece;
	}
	
	//set y get

}
