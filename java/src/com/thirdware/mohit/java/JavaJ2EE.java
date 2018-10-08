package com.thirdware.mohit.java;

public class JavaJ2EE {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s = "javaj2ee";
     for(int i = 0; i < s.length(); i++)
     {
    	 for(int j = 0; j <= i; j++)
    	 {
    		 System.out.print(s.charAt(j));
    	 }
    	 System.out.println();
     }
     for(int i = s.length(); i > 0; i--)
     {
		 for(int j = 0; j <= i - 2; j++)
		 {
			 System.out.print(s.charAt(j));
		 }
   	     System.out.println();
     }
	}
}
