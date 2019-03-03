

import java.util.Scanner;

public class EmployeeList{

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    
	
    int choice = 0;
    do {
    	System.out.println("\nEnter the number corresponding to your choice:\n1) Create list of employees.\n2) Exit");
    	choice = input.nextInt();
    	
    	switch(choice) {
    	case 1:
    		System.out.println("Enter the number of employee in your company:");
    		int num = input.nextInt();
   	
    		String EmployeeList [][]= ListConstructor.createList(num);
    		ListConstructor.fillList(EmployeeList);
    		
    		break;
    	case 2:
    		System.out.print("\nGoodBye");
    		System.exit(0);
    		
    		break;
    	default:
    		System.out.print("\nInvalid Option");
    	}	    
    }while(choice<2 || choice>2);
  }
}

