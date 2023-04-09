import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("coloque uma expressao matematica:");
		String expressao = input.nextLine();
		char[] expressaoCaracteres = new char[expressao.length()];
		
		input.close();
		
		expressao.getChars(0, expressao.length(), expressaoCaracteres, 0);
		
		if(verificaFormacao(expressaoCaracteres) == 0)
		System.out.println("a expressao esta bem formada.");
		
		else
		System.out.println("a expressao NAO esta bem formada.");
		
	}
	
	public static int verificaFormacao(char[] caracteres)
	{
		int cont=0;
		for(int i=0;i<caracteres.length;i++)
		{
			if(caracteres[i] == '(' || caracteres[i] == '{' || caracteres[i] == '[')
			cont++;	
		    if(caracteres[i] == ')' || caracteres[i] == '}' || caracteres[i] == ']')
			cont--;
		}
	return cont;
	}
}
