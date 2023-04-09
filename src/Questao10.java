import java.util.Scanner;
public class Questao10 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			 System.out.println("informe o numero de linhas e colunas:");
		        int linhas = input.nextInt();
		        int colunas = input.nextInt();
		        
		        input.close();
		        //obs: a letra 'a' so funciona da forma certa se  numero de linhas = numero de colunas
		        System.out.print("a)\n");
		        for (int i=0;i<linhas;i++) 
		        {
		            for (int j=0;j<linhas;j++) 
		            {
		                if (j <= i) 
		                System.out.print(j + " ");
		               
		                else 
		                System.out.print("  ");    
		            }
		            System.out.println();
		        }
		        	
		        System.out.println("\nb)");
		        
		        for (int i=0;i<linhas;i++) 
		        {
		            for (int j=0;j<colunas;j++) 
		            {
		                if ((i+j) % 2 == 0) 
		                System.out.print("@ ");
		                
		                else 
		                System.out.print("* ");          
		            }
		            System.out.println();
		        }
		        	        	        
	}

}

