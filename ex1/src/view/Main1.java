package view;

import br.fateczl.calc.quicksort.operations;

public class Main1 
{
	public static void main(String[] args) 
	{
		operations c = new operations();
		
		int[] vet = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		
		
		int[] resultado = c.QuickSort(vet, 0, (vet.length - 1));
		
		for (int r : resultado)
		{
			System.out.print(r + " ");
		}
		
	}
}
