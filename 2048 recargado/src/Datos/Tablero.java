package Datos;

public abstract class Tablero {
	//atributos
	private int dimensi�n, puntaje;
	private N�mero[][] cuadr�cula;
	private R�cordT r�cord;
	//atributos
	
	

	//constructor
	/**
	 * Constructor
	 * @param dim entero
	 * @param rec recordT
	 */
	public Tablero(int dim, R�cordT rec){
		this.dimensi�n=dim;
		this.setR�cord(rec);
		this.setPuntaje(0);
	}
	//constructor

	
	//set y get
	public void setCuadr�cula(N�mero[][] cuad) {
		this.cuadr�cula=cuad;
	}
	public void setPuntaje(int punt) {
		this.puntaje=punt;
	}
	public void setR�cord( R�cordT rc) {
		this.r�cord=rc;
	}
	public int getDimensi�n() {
		return this.dimensi�n;
	}
	public int getPuntaje() {
		return this.puntaje;
	}
	public N�mero[][] getCuadr�cula() {
		return this.cuadr�cula;
	}
	public R�cordT getR�cord() {
		return this.r�cord;
	}
	//set y get
	
	//toString
	public int[][] toInt() {
		int dim=this.getDimensi�n();
		int convertida [][]=new int[dim][dim];
		for(int i=0; i<dim; i++) {
			for(int j=0; j<dim; j++) {
				convertida[i][j]=this.getCuadr�cula()[i][j].getValor();
			}
		}
		return convertida;
	}
	@Override
	public String toString() {
		String convertidaS="";
		int dim=this.getDimensi�n();
		for(int i=0; i<dim; i++) {
			for(int j=0; j<dim; j++) {
				if(this.getCuadr�cula()[i][j].getValor()==1) {
					convertidaS=convertidaS+"0";
				}else{
				convertidaS=convertidaS+Integer.toString(this.getCuadr�cula()[i][j].getValor());
				}
			}
			convertidaS=convertidaS+"\n";
		}
		
		return convertidaS;
		
	}
	//toString
}
