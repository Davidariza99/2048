package Datos;

import java.util.Random;


//Tablero clásico, modo X, supervivencia, y 5x5 6x6
public final class Tablero1 extends Tablero{

	public Tablero1(int dim, RécordT rec) {
		super(dim, rec);
		
		
		Número cuad[][]=new Número[dim][dim];
		for (int i=0;i<dim;i++) {				//llena tablero de números vacíos
			for (int j=0;j<dim;j++) {
				int [] pos = {i,j};
				Número n=new Número(0, pos);
				cuad[i][j] =n;
			}
		}
		
		//SEGUIR: COLOCANDO DOS 2 ALEATORIOS
	
		this.setCuadrícula();
	}

}
