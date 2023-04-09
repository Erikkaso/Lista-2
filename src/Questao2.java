import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		int soma=0, numero=0;
		Scanner input = new Scanner(System.in);
		
		while (numero>=0) {
		System.out.println("adcione um numero");
		numero = input.nextInt();
		
		if(numero > 0)
		soma += numero;
		}
		
		input.close();
		System.out.println("O valor da soma eh:" + soma);
	}

}
