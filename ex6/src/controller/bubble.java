package controller;

import br.edu.fateczl.calc.bubble.operations;

public class bubble 
{
	
	public bubble()
	{
		super();
	}
	
	public void Bubblesort(int [] vet) 
	{
		operations b = new operations();
		
		double tempoinicial = (System.nanoTime() * Math.pow(10, 9));
		
		b.bublesort(vet);
		
		double tempofinal = (System.nanoTime() * Math.pow(10, 9));
		
		double tempototal = tempofinal - tempoinicial;
		
		System.out.println("Bubblesort demorou " + tempototal + "(ns)");
	}
	
}
