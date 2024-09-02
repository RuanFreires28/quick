package controller;

import br.edu.fateczl.calc.merse.operations;

public class merge 
{
	public merge()
	{
		super();
	}
	
	public void Mergesort(int [] vet) 
	{
		operations m = new operations();
		
		double tempoinicial = (System.nanoTime() * Math.pow(10, 9));
		
		m.MergeSort(vet, 0, (vet.length - 1));
		
		double tempofinal = (System.nanoTime() * Math.pow(10, 9));
		
		double tempototal = tempofinal - tempoinicial;
		
		System.out.println("Mergesort demorou " + tempototal + "(ns)");
	}
}
