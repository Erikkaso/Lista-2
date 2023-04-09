import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("insira o tamanho do coluna esquerda e direita respectivamente:");
		int colunaEsq = input.nextInt();
		int colunaDir = input.nextInt();
		
		for(int i=0;i<=colunaEsq;i++)
		{
			for(int j=0;j<=colunaDir;j++)
			{
				System.out.println(i+"-"+j);
			}
		}
		input.close();
	}

}
