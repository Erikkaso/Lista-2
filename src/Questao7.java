import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("insira um numero:");
		int numero = input.nextInt();
		boolean primo = false;
		
		while(primo == false)
		{
			if (numero == 2 || numero == 3 || numero == 5 || numero == 7)
				primo = true;
			
			else if (numero%2 != 0 && numero%3 != 0 && numero%5 != 0 && numero%7 != 0)
		    	primo = true;	
			
			else
				numero--;
			
		}
		System.out.println("o numero primo mais proximo eh:" + numero);
		input.close();
	}
}
