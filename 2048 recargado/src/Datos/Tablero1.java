package Datos;

import java.util.Random;
import L�gica.Cor;


//Tablero cl�sico, modo X, supervivencia, y 5x5 6x6
public final class Tablero1 extends Tablero{
	
	//constructor

	public Tablero1(int dim, R�cordT rec) {
		super(dim , rec);
		
		
		N�mero cuad[][]=new N�mero[dim][dim];
		for (int i=0;i<dim;i++) {				//llena tablero de n�meros vac�os
			for (int j=0;j<dim;j++) {
				int [] pos = {i,j};
				N�mero n=new N�mero(0, pos);
				cuad[i][j] =n;
			}
		}
		this.setCuadr�cula(cuad);
		
		//Coloca dos 2 aleatorios
		Random azar=new Random(System.currentTimeMillis());
		int numF;
		int numC;
		for(int i =0;i<2;i++) {
			do {
			numF =azar.nextInt(dim);
			numC =azar.nextInt(dim);
			}while(!Cor.revisaDisponibilidad(this.getCuadr�cula(), numF, numC));			
			cuad[numF][numC].sumarVezJugada();
			this.setCuadr�cula(cuad);
		}

	}
	//constructor

}
