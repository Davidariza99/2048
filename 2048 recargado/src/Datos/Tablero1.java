package Datos;

import java.util.Random;


//Tablero cl�sico, modo X, supervivencia, y 5x5 6x6
public final class Tablero1 extends Tablero{

	public Tablero1(int dim, R�cordT rec) {
		super(dim, rec);
		
		
		N�mero cuad[][]=new N�mero[dim][dim];
		for (int i=0;i<dim;i++) {				//llena tablero de n�meros vac�os
			for (int j=0;j<dim;j++) {
				int [] pos = {i,j};
				N�mero n=new N�mero(0, pos);
				cuad[i][j] =n;
			}
		}
		
		//SEGUIR: COLOCANDO DOS 2 ALEATORIOS
	
		this.setCuadr�cula();
	}

}
