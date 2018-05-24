package Lógica;
import Datos.Número;
import Datos.*;

public class Cor {

	public static void main(String[] args) {
		Tablero tableroPrueba=new Tablero1(6,null);
		System.out.println(tableroPrueba.toString());

	}
	
	
	
	
	
	
	/**
	 * método que recibe un tablero, y una posición (fila columna. Verifica si esa posición está vacía)
	 */
	public static boolean revisaDisponibilidad(Número[][] números, int fil, int col) {
		boolean vacía;
		if (números[fil][col].getVacía()) {
			vacía=true;
		}
		else {
			vacía=false;
		}
		return vacía;
		
	}

}
