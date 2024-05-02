package lacosRepeticao;

import java.util.Scanner;

public class ExercicioWhile {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);	
		int idade ;
		int menores21 = 0;
		int maiores50 = 0;
		
		while(true) {
			System.out.println("Digite uma idade:");
			idade = leia.nextInt();
			idade++;
			
			if(idade <= 0) {
				break;
			}
			
			if (idade < 21) {
				menores21++;
			}
			else if (idade > 50) {
				maiores50++;
			}
		}
		System.out.println("\nTotal de pessoas menores de 21 anos:" + menores21);
		System.out.println("Total de pessoas maiores de 50 anos:" + maiores50);
	}
}
		
		




