package employeeWageFellowship;


public class EmployeeWage {
	
	public static void main(String args[]) {
		System.out.println("Welcome to Employee Wage Computation");
			int Part_Time = 0;
			int Full_Time = 1;
			int Emp_Check = (int) Math.floor(Math.random() * 10) % 2;
				if (Emp_Check == 1) { 
					System.out.println("Employee is Present");
				}
				else { 
					System.out.println("Employee is Absent");
				}		
		}	
}
