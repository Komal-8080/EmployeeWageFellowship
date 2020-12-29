package employeeWageFellowship;


public class EmployeeWage {
	
	//main Method 
	public static void main(String args[]) {
		System.out.println("Welcome to Employee Wage Computation");
		Computation();
	}
	
	//Computation
	public static void Computation() {	
			int Part_Time = 1;
			int Full_Time = 2;
			int Employee_Rate_Per_Hour = 20;
			int Emp_Hours = 0;
			int Emp_Wage = 0;
			
			int Emp_Check = (int) Math.floor(Math.random() * 10) % 2;
				if (Emp_Check == Full_Time) {
					Emp_Hours = 8;
				}
				else if (Emp_Check == Part_Time) {
					Emp_Hours = 4;					
				}
				else { 
					System.out.println("Employee is Absent");
					Emp_Hours = 0;
				}
					Emp_Wage = Emp_Hours * Employee_Rate_Per_Hour;
					System.out.println("Employee Wage is " + Emp_Wage);
		}	
}
