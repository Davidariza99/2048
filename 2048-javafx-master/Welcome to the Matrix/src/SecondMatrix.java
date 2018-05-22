
public class SecondMatrix {

	public static void main(String[] args) {
		char m2[][]= new char [][] { new char []{'a','b','c'}, new char []{'d','e','f'}, new char []{'g','h','i'}};
		
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++){
				System.out.print(m2[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		char array2[]= new char [3];
		int cont2=0;
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++){
				if (j==0 && i==0){
					array2[cont2] = m2[i][j];
					cont2++;		
				}
				if (j==1 && i==1){
					array2[cont2] = m2[i][j];
					cont2++;		
				}
				if (j==2 && i==2){
					array2[cont2] = m2[i][j];
				}
			}
		}
		
		for (int i=0;i<3;i++){
			System.out.print(array2[i]);
		}

	}

}
