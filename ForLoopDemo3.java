package com.prowings.basics;

public class ForLoopDemo3 {
	//nested loop

	public static void main(String[] args) {
		 
		System.out.println("main started");
		
		for (int i=1; i<=5; i++)
		{
			for(int j=1; j<=3; j++)
			{
				System.out.println(i+""+j);
			}
		}
	}

}
