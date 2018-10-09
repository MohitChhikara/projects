package com.thirdware.mohit.java.task3;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class age {

	public static void main(String[] args) {
	       System.out.print("Please enter date of birth in YYYY-MM-DD: ");
	       Scanner sc = new Scanner(System.in);
	       String dateOfBirth = sc.nextLine();
	       

	       LocalDate dob = LocalDate.parse(dateOfBirth);
	       System.out.println("Age is:" + getAge(dob));
	   }

	   public static int getAge(LocalDate dob) {
	       LocalDate currentDate = LocalDate.now();
	       return Period.between(dob, currentDate).getYears();
	   }	
	   }


