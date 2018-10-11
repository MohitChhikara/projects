package com.thirdware.mohit.java.task4;

import java.util.Scanner;

public class smallestGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int arr[] = {6, 3, 9, 8, 10, 2, 1, 15, 7};
	    for (int i = 0; i < arr.length; i++)  
	    { 	  
	        int diff = Integer.MAX_VALUE; 
	        int nearest = -1; 
	        for (int j = 0; j < arr.length; j++)  
	        { 
	            if (arr[i] < arr[j] &&  
	                arr[j] - arr[i] < diff) 
	            { 
	                diff = arr[j] - arr[i]; 
	                nearest = j;          
	            } 
	        }
	        if(nearest == -1) 
	        System.out.print( "_ " ); 
	        else
	        System.out.print(arr[nearest] + " "); 
	    }
	}
}
	    		
	


    	

