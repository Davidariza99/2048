
public class FirstMatrix {

	public static void main(String[] args) {
		int m1[][]= new int [3][3];
		int cont=1;
		
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++){
				m1[i][j]=cont;
				cont++;
			}
		}
		
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++){
				System.out.print(m1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		int array1[]= new int [3];
		int cont2=0;
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++){
				if (j==2 && i==0){
					array1[cont2] = m1[i][j];
					cont2++;		
				}
				if (j==1 && i==1){
					array1[cont2] = m1[i][j];
					cont2++;		
				}
				if (j==0 && i==2){
					array1[cont2] = m1[i][j];
				}
			}
		}
		
		for (int i=0;i<3;i++){
			System.out.print(array1[i]);
		}
		
	}

}
