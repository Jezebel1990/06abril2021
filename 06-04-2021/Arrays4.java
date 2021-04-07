package arraysExercicios;

import java.util.*;

public class Arrays4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matriz3 = new float[2][2];
		int constante,op;
		
		Scanner leia = new Scanner(System.in);
		
		for(int l=0;l<2;l++)
		{
			for(int c=0;c<2;c++)
			{
		System.out.println("\nEntre com o valor da matriz1: ");
		matriz1[l][c] = leia.nextFloat();
		System.out.println("\nEntre com o valor da matriz2: ");
		matriz2[l][c] = leia.nextFloat();
	}
}
	System.out.println("\nEntre com o valor da constante: ");
	constante = leia.nextInt();
	System.out.println("\n1- Somar as duas matrizes ");
	System.out.println("\n2- Subtrair a primeira matriz da segunda ");
	System.out.println("\n3- Adicionar uma constante as duas matrizes ");
	System.out.println("\n4- Imprimir as matrizes ");
	System.out.println("\n5- SAIR ");
	System.out.println("\n1- Qual opção deseja executar? ");
	op = leia.nextInt();
	while(op<1 || op>5)
	{
		System.out.println("\n1- Somar as duas matrizes ");
		System.out.println("\n2- Subtrair a primeira matriz da segunda ");
		System.out.println("\n3- Adicionar uma constante as duas matrizes ");
		System.out.println("\n4- Imprimir as matrizes ");
		System.out.println("\n5- SAIR ");
		System.out.println("\nOpção Inválida. Qual opção deseja executar? ");
		op =leia.nextInt();
	}
	if(op!=5)
	{
		switch(op)
		{
		case 1:
			for(int l=0;l<2;l++)
			{
				for(int c=0;c<2;c++)
				{
					matriz3[l][c] = matriz1[l][c] + matriz2[l][c];
					System.out.println("\nSomatório:"+matriz3[l][c]);
				}
			}
			break;
		case 2:
			for(int l=0;l<2;l++)
			{
				for(int c=0;c<2;c++)
				{
					matriz3[l][c] = matriz2[l][c] - matriz1[l][c];
					System.out.println("\nDiferença: "+matriz3[l][c]);
				}
			}
			break;
		case 3:
			for(int l=0;l<2;l++)
			{
				for(int c=0;c<2;c++)
				{
					matriz1[l][c] = matriz1[l][c] + constante;
					matriz2[l][c] = matriz2[l][c] + constante;
					System.out.println("\nMatriz1: "+matriz1[l][c]+"\t\tMatriz2: "+matriz2[l][c]);
					}
				}
				break;
			case 4:
				for(int l=0;l<2;l++)
				{
					for(int c=0;c<2;c++)
					{
						System.out.println("\nMatriz1: "+matriz1[l][c]+"\t\tMatriz2: "+matriz2[l][c]);
					}
				}
				break;
			
			}
		}
		else
		{
			System.out.println("\n Beijinho, beijinho, tchau tchau...");
							
				}
			}
		}
	
	
	
	
