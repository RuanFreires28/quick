package controller;

import br.fateczl.calc.quicksort.operations;

public class quick 
{
	public quick()
	{
		super();
	}
	
	public void Quicksort(int [] vet) 
	{
		operations q = new operations();
		
		double tempoinicial = (System.nanoTime() * Math.pow(10, 9));
		
		q.QuickSort(vet, 0, (vet.length - 1));
		
		double tempofinal = (System.nanoTime() * Math.pow(10, 9));
		
		double tempototal = tempofinal - tempoinicial;
		
		System.out.println("Quicksort demorou " + tempototal + "(ns)");
	}
}
