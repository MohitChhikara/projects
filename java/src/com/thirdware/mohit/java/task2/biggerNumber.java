package com.thirdware.mohit.java.task2;
import java.util.*;

public class biggerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s = new Scanner(System.in);
   System.out.println("enter a number");
   int a = s.nextInt();
   System.out.println("enter another number");
   int b = s.nextInt();
   if(a > (b + 2))
   {
	   System.out.println(a);
   }
   else if(b > (a + 2))
   {
	   System.out.println(b);
   }
   else
   {
	   System.out.println("INCONCLUSIVE");
   }
	}
}
