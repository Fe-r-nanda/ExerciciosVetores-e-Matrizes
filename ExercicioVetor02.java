package ExerciciosVetoresMatrizes;
/*Autora: Fernanda Correia
 * Data: 06/07/21
 */
import java.util.Scanner;

public class ExercicioVetor02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
	
		double[] lancamento = new double[10];
		double soma= 0.0, aritmetica, maior = 0.0;
		int i, contMaior=0;
		
		System.out.println("Digite aqui o valor de cada lan�amento do dado: ");
		for(i=0; i<=9; i++) {
			lancamento[i] = ler.nextDouble();
			soma = soma + lancamento[i];
			
			
			if(lancamento[i] > maior) {
				maior = lancamento[i];
				contMaior = 0;
			}
				if(lancamento[i] == maior) {
					contMaior++;
			
				}
		}

		System.out.println("O vetor �: ");
		for(i=0; i<=9; i++) {
			System.out.print(lancamento[i] + " , ");
			
		}
		aritmetica = soma /10;
		
		System.out.println("\nA m�dia aritm�tica dos valores lan�ados �: " + aritmetica);
		System.out.println("\nA quantidade de ocorr�ncias da maior pontua��o �: " + contMaior);

	}
}
