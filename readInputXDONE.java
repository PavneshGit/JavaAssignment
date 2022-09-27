package day1_Assignment;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

 public class readInputXDONE {
 public static void main(String[] args) { 
// TODO Auto-generated method stub
 List<String> userData = new ArrayList<>();
 System.out.println("Please enter your data below: (send 'XDONE' to exit) ");
 Scanner sc = new Scanner(System.in); 
 while (true) { 
	 String input = sc.nextLine(); 
	 if ("XDONE".equalsIgnoreCase(input)) { 
		 break; 
	 }
 userData.add(input); 
 }
 System.out.printf("User Input data:\n%s",String.join("\n", userData)); 
 }
 }
