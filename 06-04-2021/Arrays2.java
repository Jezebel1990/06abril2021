package arraysExercicios;

import java.util.*;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros=new int[6];
		int somapar=0,contimpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i=0;i<6;i++)
		{
		System.out.println("Entre com um n�mero: ");
		numeros[i] = leia.nextInt();
		
		if (numeros[i]%2==0) 
		{
				somapar = somapar + numeros[i];
			}
			else
			{
				contimpar++;
			}
		}
		for(int i=0;i<6;i++)
		{
			if(numeros[i]%2==0)
			{
       System.out.println(numeros[i]+ " <-- � um n�mero par ");
     	}
			else
        {
			System.out.println(numeros[i]+ " <-- � um n�mero �mpar ");
            }
		}
System.out.println("\nSoma dos n�meros pares: "+somapar);
System.out.println("\nQuantidade de n�meros impares: "+contimpar);
}
}


