package Datos;

import java.util.Random;
import Lógica.Cor;


//Tablero clásico, modo X, supervivencia, y 5x5 6x6
public final class Tablero1 extends Tablero{
	
	//constructor

	public Tablero1(int dim, RécordT rec) {
		super(dim , rec);
		
		
		Número cuad[][]=new Número[dim][dim];
		for (int i=0;i<dim;i++) {				//llena tablero de números vacíos
			for (int j=0;j<dim;j++) {
				int [] pos = {i,j};
				Número n=new Número(0, pos);
				cuad[i][j] =n;
			}
		}
		this.setCuadrícula(cuad);
		
		//Coloca dos 2 aleatorios
		Random azar=new Random(System.currentTimeMillis());
		int numF;
		int numC;
		for(int i =0;i<2;i++) {
			do {
			numF =azar.nextInt(dim);
			numC =azar.nextInt(dim);
			}while(!Cor.revisaDisponibilidad(this.getCuadrícula(), numF, numC));			
			cuad[numF][numC].sumarVezJugada();
			this.setCuadrícula(cuad);
		}
		//
	}
	//constructor

}
