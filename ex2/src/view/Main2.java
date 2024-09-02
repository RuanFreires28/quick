package view;

import br.fateczl.calc.quicksort.operations;

public class Main2 
{
	public static void main(String[] args) 
	{
		operations c = new operations();
		
		int[] vet = {44, 43, 42, 41, 40, 39, 38};
		
		
		int[] resultado = c.QuickSort(vet, 0, (vet.length - 1));
		
		for (int r : resultado)
		{
			System.out.print(r + " ");
		}
		
	}
}
