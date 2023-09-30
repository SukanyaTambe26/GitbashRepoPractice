package com.prowings.basics;

public class ForLoopDemo10 {

	public static void main(String[] args) {
		//continue
		int week=4;
		 int days=7;
		 
		 for(int i=1; i<=week; i++)
		 {
			 System.out.println("week="+ i);
			
			 for(int j=1; j<=days; j++)
			 {if(j % 2==0)
			 {
				 continue;
			 }
			 
			System.out.println("days="+ j);
		 }
		 
	}

}


	}
		
	

