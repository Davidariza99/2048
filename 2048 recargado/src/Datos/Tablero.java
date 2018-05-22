package Datos;

public abstract class Tablero {
	//atributos
	private int dimensión, puntaje;
	private Número[][] cuadrícula;
	private RécordT récord;
	//atributos
	
	

	//constructor
	public Tablero(int dim, RécordT rec) {
		this.dimensión=dim;
		this.setRécord(rec);
	}
	//constructor

	
	//set y get
	public void setCuadrícula(Número[][] cuad) {
		this.cuadrícula=cuad;
	}
	public void setPuntaje(int punt) {
		this.puntaje=punt;
	}
	public void setRécord( RécordT rc) {
		this.récord=rc;
	}
	public int getDimensión() {
		return this.dimensión;
	}
	public int getPuntaje() {
		return this.puntaje;
	}
	public Número[][] getCuadrícula() {
		return this.cuadrícula;
	}
	public RécordT getRécord() {
		return this.récord;
	}
	//set y get
	
	//toString
	public int[][] toInt() {
		int dim=this.getDimensión();
		int convertida [][]=new int[dim][dim];
		for(int i=0; i<dim; i++) {
			for(int j=0; j<dim; j++) {
				convertida[i][j]=this.getCuadrícula()[i][j].getValor();
			}
		}
		return convertida;
	}
	//toString
}
