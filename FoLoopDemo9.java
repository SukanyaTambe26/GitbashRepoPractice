package com.prowings.basics;

public class FoLoopDemo9 {

	public static void main(String[] args) {
		// break
		 int week=4;
		 int days=7;
		 
		 for(int i=1; i<=week; i++)
		 {
			 System.out.println("week="+ i);
			
			 for(int j=1; j<=days; j++)
			 {if(i==3)
			 {
				 break;
			 }
			 
			System.out.println("days="+ j);
		 }
		 
	}

}


	}


