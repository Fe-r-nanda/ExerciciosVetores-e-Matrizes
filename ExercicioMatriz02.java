package ExerciciosVetoresMatrizes;
/*Autora: Fernanda Correia
 * Data: 06/07/21
 */

import java.util.Scanner;

public class ExercicioMatriz02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int [][] matriz = new int[3][3]; 
		int l, c, somaDiagonal = 0, soma = 0;

			System.out.println("Digite os números da matriz: ");
					for(l=0; l<3; l++){
						for(c=0; c<3; c++){
						matriz[l][c] = ler.nextInt();
						soma = soma + matriz[l][c];
						if(l == c) {
							somaDiagonal = somaDiagonal + matriz[l][c];
						}
					}
				}
					System.out.println("\nA soma dos valores da matriz é: " + soma);
					System.out.println("\nA soma da diagonal da matriz é: " + somaDiagonal);
				}

}



