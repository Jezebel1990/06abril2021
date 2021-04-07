package arraysExercicios;

import java.util.*;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int[] vetorA = {1,0,5,-2,-5,7};
		
		int soma, i;
		
		soma = vetorA[0] + vetorA[1] + vetorA[5];
		
		System.out.printf("Soma: %d\n\n",soma);
		 vetorA[4] =100;
		
		for(i = 0; i <6; i++) {
			
		System.out.printf("%d\n", vetorA[i]);
}
}
}