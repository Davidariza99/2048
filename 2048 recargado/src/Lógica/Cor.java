package L�gica;
import Datos.N�mero;
import Datos.*;

public class Cor {

	public static void main(String[] args) {
		Tablero tableroPrueba=new Tablero1(6,null);
		System.out.println(tableroPrueba.toString());

	}
	
	
	
	
	
	
	/**
	 * m�todo que recibe un tablero, y una posici�n (fila columna. Verifica si esa posici�n est� vac�a)
	 */
	public static boolean revisaDisponibilidad(N�mero[][] n�meros, int fil, int col) {
		boolean vac�a;
		if (n�meros[fil][col].getVac�a()) {
			vac�a=true;
		}
		else {
			vac�a=false;
		}
		return vac�a;
		
	}

}
