package employeeWageFellowship;


public class EmployeeWage {
	
	public static final int Part_Time = 1;
	public static final int Full_Time = 2;
	public static final int Employee_Rate_Per_Hour = 20;
		
	//Computation
	public static void Computation() {	
			int Emp_Hours = 0;
			int Emp_Wage = 0;
			int Emp_Check = (int) Math.floor(Math.random() * 10) % 2;
			
				switch (Emp_Check) {
				case Full_Time:
					Emp_Hours = 8;
					break;
				case Part_Time:
					Emp_Hours = 4;
					break;
				default: 
					System.out.println("Employee is Absent");
					Emp_Hours = 0;
					break;
				}
					Emp_Wage = Emp_Hours * Employee_Rate_Per_Hour;
					System.out.println("Employee Wage is " + Emp_Wage);
		}	
	
	//main Method 
		public static void main(String args[]) {
			System.out.println("Welcome to Employee Wage Computation");
			Computation();
		}
		
}
