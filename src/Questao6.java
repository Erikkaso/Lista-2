import java.util.Scanner;

public class Questao6 {

public static void main(String[] args) {
		
		int cont = 0;	
		Scanner input = new Scanner(System.in);
		
		System.out.println("informe o tamanho da matriz:");
		int tamanho = input.nextInt();
		
		int[][] matriz = new int[tamanho][tamanho];
		int[][] transposta = new int[tamanho][tamanho];
		
		System.out.print("informe os valores da matriz na ");
		for(int i=0;i<tamanho;i++)
		{
			for(int j=0;j<tamanho;j++)
			{	
				System.out.println("linha: "+(i+1)+" coluna: "+(j+1));
				matriz[i][j] = input.nextInt();
				transposta[j][i] = matriz[i][j];
			}
		}
		input.close();
		
		System.out.println("\napos analisar a transposta:");
		for(int i=0;i<tamanho;i++)
		{
			for(int j=0;j<tamanho;j++)
			{
				System.out.print(transposta[i][j]+ "\t");
			}
			System.out.print("\n");
		}
		
		for(int i=0;i<tamanho;i++)
		{
			for(int j=0;j<tamanho;j++)
			{
				if(matriz[i][j] != transposta[i][j])
				{
					cont++;
				}
			}
		}
		
		if(cont == 0) 
		System.out.println("\nMatrix is a Symmetric Matrix");
		
		else 
		System.out.println("\nMatrix is Not a Symmetric Matrix");
	}
}
