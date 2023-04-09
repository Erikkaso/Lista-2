import java.util.Scanner;
import java.util.Random;

public class Questao3 {

	public static void main(String[] args) {
		int numeroCerto, tentativa;
		Scanner input = new Scanner(System.in);
		Random aleatorio = new Random();
		
		numeroCerto = aleatorio.nextInt(100) + 1;
		
		System.out.println("Chute um Numero");
		tentativa = input.nextInt();
		
		while(tentativa != numeroCerto) 
		{
			if(tentativa > numeroCerto) 
			{
				System.out.println("o valor que escolheu é maior que o valor certo, tente de novo:");
				tentativa = input.nextInt();
			}
			else if(tentativa < numeroCerto)
			{
				System.out.println("o valor que escolheu é menor que o valor certo, tente de novo:");
				tentativa = input.nextInt();	
			}
		}
		input.close();
		System.out.println("Parabens!, voce acertou, o numero era: "+ tentativa);
	}

}


