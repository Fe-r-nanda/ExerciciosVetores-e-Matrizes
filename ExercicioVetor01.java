package ExerciciosVetoresMatrizes;
/*Autora: Fernanda Correia
 * Data: 06/07/21
 */
import java.util.Scanner;

public class ExercicioVetor01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double[] pontos = new double [5];
	    double maior = 0.0;
		int i = 0;
		
		
		System.out.println("Digite as 4 pontua��es da atividade: ");
		for(i=0; i< 4; i++) {
			pontos[i] = entrada.nextDouble();
		
		
			if (pontos[i] > maior) {
				maior = pontos[i];
			}
		}
			System.out.println("---As pontua��es foram:---");
			for(i=0; i< 4; i++) {
			System.out.print(pontos[i] + "  ");
			
			
		}
			System.out.println("  ");
		System.out.println("A maior pontua��o �: " + maior);

		
	}

}