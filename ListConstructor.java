import java.util.Scanner;

public class ListConstructor {
	
	static Scanner input = new Scanner(System.in);
	
	public static String[][] createList(int size) {
		String EmployeeList[][] = new String[size][7];
		return EmployeeList;
	}
	
	public static void fillList(String EmployeeList[][]) {
		
		
		if (EmployeeList[0][0]==null) {
			System.out.println("\nThis List is Empty");
			listMenu(EmployeeList, 0);
			calculateWage(EmployeeList);
			//selectSort(EmployeeList);
		}
			
		displayList(EmployeeList);
		
		boolean stop = false;
		
		for(int i=0; i<EmployeeList[i].length;i++) {
			if (stop == false && EmployeeList[i][0]==null) {
				System.out.println("\nPlease enter the next employyee's information.");
				
				listMenu(EmployeeList, i);
				calculateWage(EmployeeList);
				//selectSort(EmployeeList);
				
				int choice = 0;
				
				do {
					System.out.println("\nDo you want to Stop:\n1) Yes\n2) No\n");
					choice = input.nextInt();
					
					switch (choice) {
					case 1: break;
					case 2: stop = true;
					default: System.out.println("\nInvalid Option");
					}
				}while(choice>2 || choice<1);
			}
		}
	}
		
	
	private static void displayList (String EmployeeList[][]) {
		for(int i=0; i<EmployeeList.length; i++) {
			if(EmployeeList[i][0]!=null) {
			System.out.println("Employee Name: "+EmployeeList[i][0]+"; Employee ID: "+EmployeeList[i][1]+"; Employee Title: "
					+EmployeeList[i][2]+"; Employee Department: "+EmployeeList[i][3]+"; Employee Hourly Rate: "
					+EmployeeList[i][4]+"/hour; Employee Hours Worked: "+ EmployeeList[i][5]+" Employee Pay: "+ EmployeeList[i][6]+";");
			}
		}
	}
	
	private static void listMenu(String EmployeeList[][], int index) {
		int choice = 0;
		
		do {
			System.out.println("\nSelect the number corresponding to the desire category to edited:\n1) Employee Name\n2) Employee ID\n"
					+ "3) Employee Title\n4) Employee Department\n5) Employee Hour Rate\n6) Employee Hours Worked\n7) Exit");
			
			choice = input.nextInt()-1;
			
			switch (choice) {
			case 0:
				System.out.println("\nPlease Enter Name of Employee");
				input.nextLine();
				EmployeeList[index][0] = input.nextLine();break;
			case 1:
				System.out.println("\nEnter Employee ID");
				EmployeeList[index][1] = Integer.toString(input.nextInt());break;
			case 2:
				System.out.println("\nEnter Employee title");
				input.nextLine();
				EmployeeList[index][2] = input.nextLine();break;
			case 3:
				System.out.println("\nEnter Employee department");
				input.nextLine();
				EmployeeList[index][3] = input.nextLine();break;
			case 4:
				System.out.println("\nEnter Employee hourly rate");
				EmployeeList[index][4] = Integer.toString(input.nextInt());break;
			case 5:
				System.out.println("\nEnter Employee hours worked");
				EmployeeList[index][5] = Integer.toString(input.nextInt());break;
			case 6:
				break;
			default: 
				System.out.println("\nInvalid Input. Try Again");break;
			}
		}while(choice<6 || choice>6);
		
	}
	
	private static void calculateWage(String EmployeeList[][]) {
		for (int i=0; i<EmployeeList.length; i++) {
			if (EmployeeList[i][0]!=null) {
				Integer Hours = Integer.valueOf(EmployeeList[i][5]);
				Integer Rate = Integer.valueOf(EmployeeList[i][4]);
				EmployeeList[i][6]= Integer.toString(Hours*Rate);
			}
			else {break;}
		}
	}
	
	private static void selectSort(String EmployeeList[][]) {
		for (int i=0; i<EmployeeList.length-1;i++) {
			int minIndex=i;
				for (int j=i+1; j<EmployeeList.length;j++) {
					int num1 = Integer.valueOf(EmployeeList[j][6]);
					int num2 = Integer.valueOf(EmployeeList[minIndex][6]);
					if (num1<num2) {
						minIndex = j;
					}
				}
			String temp [][]=new String[1][7];
				
			temp[0] = EmployeeList[i];
			EmployeeList[i] = EmployeeList[minIndex];
			EmployeeList[minIndex] = temp[0];
		}
	}
	
}
