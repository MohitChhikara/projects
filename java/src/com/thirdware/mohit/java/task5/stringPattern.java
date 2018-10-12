package com.thirdware.mohit.java.task5;

import java.util.Scanner;

public class stringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string");
    String str = sc.nextLine();
    for(int i = 0; i < str.length(); i++)
    {
    	for(int j = 0; j <= i; j++)
    	{
    		System.out.print(str.charAt(j) + " ");
    	}
    	System.out.println();
    }
    for(int i = 1; i <= str.length() - 1; i++)
    {
    	for(int j = 0; j < str.length() - i; j++)
    	{
    		System.out.print(str.charAt(j) + " ");
    	}
    	System.out.println();
    }
    }
	}


