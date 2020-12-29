package employeeWageFellowship;


public class EmployeeWage {
	
	public static final int Part_Time = 1;
	public static final int Full_Time = 2;
	public static final int Employee_Rate_Per_Hour = 20;
	public static final int Number_Of_Working_Days = 20;
		
	//Computation
	public static void Computation() {	
			int Emp_Hours = 0;
			int Emp_Wage = 0;
			int Total_Wage_Per_Month = 0;
			
		for (int day = 0; day < Number_Of_Working_Days; day++) {	
			int Emp_Check = (int) Math.floor(Math.random() * 10) % 3;
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
					Total_Wage_Per_Month = Total_Wage_Per_Month + Emp_Wage;
					System.out.println("Employee Wage is " + Emp_Wage);
				}
					System.out.println("Total Employee Wage Per Month is " + Total_Wage_Per_Month );
			}	
	
	
	//main Method 
		public static void main(String args[]) {
			System.out.println("Welcome to Employee Wage Computation");
			Computation();
		}
		
}
