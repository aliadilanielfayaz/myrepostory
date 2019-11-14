package com.ucad.tplogiciel;

public class Testb {

	public static void main( String [] args) {
		
		int a=1;
		String ch= "3";
		int b = Integer.parseInt(ch);
		
		if(b!=0)
			{
			  for(int i=1; i<=b;i++)
			  {
				a=a*i;
				
			   }
			}
		else
			a=1;
		
		System.out.println(a);
		
		System.out.println(HellooWorld.getMessage(""));

	}
	

}
