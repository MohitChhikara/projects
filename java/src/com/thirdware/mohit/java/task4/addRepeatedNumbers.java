package com.thirdware.mohit.java.task4;

import java.util.Scanner;

public class addRepeatedNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("how many elements you want to enter");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("enter the elements");
    for(int i = 0; i < n; i++)
    {
	    a[i] = sc.nextInt();
	}
    for(int i = 0; i < n; i++)
    {
    	for(int j = i + 1; j < n; j++)
    	{
    		if(a[i] == a[j])
    		{
    			a[i] = a[i] + a[j];
    			a[j] = 0;
    		}
    	}
    }
    int i;
    for(i = 0; i < n; i++)
    {
    	if(a[i] == 0)
    	{
    		break;
    	}
    }
    for(int j = i + 1; j < n; j++)
    {
    	if(a[j] != 0)
    	{
    		int temp = a[i];
    		a[i] = a[j];
    		a[j] = temp;
    		i++;		
    	}
    }
    for(int k = 0; k < n ; k++)
    {
    	System.out.print(a[k] + ",");
    }
	}
}
   