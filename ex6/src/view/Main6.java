package view;

import controller.*;

public class Main6 
{
	public static void main(String[] args) 
	{
		
		bubble b = new bubble();
		merge m = new merge();
		quick q = new quick();
		
		int[] vet = new int [1500];
		
		for (int i = 0; i < 1500; i++)
		{		
			int x = 1500;
			vet[i] = x;
			x--;
		}
		
		b.Bubblesort(vet);
		m.Mergesort(vet);
		q.Quicksort(vet);
	}
}
