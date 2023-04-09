import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		int numero, i=1;
		Scanner input = new Scanner(System.in);
			
		System.out.println("Coloque um Numero ");
		numero = input.nextInt();
		input.close();
		while(i <= 10) 
		{
			int multiplica = i*numero;
			
			System.out.println(i + "*" + numero + " = " + multiplica);
			i++;
		}
	}

}
