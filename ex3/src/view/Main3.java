package view;

import br.fateczl.calc.quicksort.operations;

public class Main3 
{
	public static void main(String[] args) 
	{
		operations c = new operations();
		
		int[] vet = {31, 32, 33, 34, 99, 98, 97, 96};
		
		
		int[] resultado = c.QuickSort(vet, 0, (vet.length - 1));
		
		for (int r : resultado)
		{
			System.out.print(r + " ");
		}
		
	}
}
