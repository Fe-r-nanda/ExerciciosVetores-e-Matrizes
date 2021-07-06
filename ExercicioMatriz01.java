package ExerciciosVetoresMatrizes;
/*Autora: Fernanda Correia
 * Data:06/07/21
 */
import java.util.Scanner;

public class ExercicioMatriz01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
				double[][] n1 = new double [4][6];
				double[][] n2 = new double [4][6];
				double[][] m1 = new double [4][6];
				double[][] m2 = new double [4][6];
				
				int l, c;

				for(l=0; l<4; l++){
					for(c=0; c<6; c++){

						System.out.println("Entre com N1: ");
						n1[l][c] = ler.nextDouble();
						
						System.out.println("Entre com N2: ");
						n2[l][c] = ler.nextDouble();
				            
				           
				            m1[l][c] = n1[l][c] + n2[l][c];
				            m2[l][c] = n1[l][c] - n2[l][c];
				            
					}
				}
				for(l=0; l<4; l++){
					for(c=0; c<6; c++){

						System.out.print("\nMatriz 1: " + m1[l][c]);
						System.out.print("\nMatriz 2: " + m2[l][c]);
					}
				}
				

	}

}
