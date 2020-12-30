package employeeWageFellowship;


public class EmployeeWage {
	
	public static final int Part_Time = 1;
	public static final int Full_Time = 2;
	
	//Computation
	public static int empComputation(String company,int Employee_Rate_Per_Hour,int Number_Of_Working_Days,int Maximum_Hours_In_Month) {	
		int Emp_Hours = 0;
		int Emp_Wage = 0;
		int Total_Wage_Per_Month = 0;
		int Total_Emp_Working_Hours = 0;
		int Total_Emp_Working_Days = 0;
			
		while (Total_Emp_Working_Hours <= Maximum_Hours_In_Month && Total_Emp_Working_Days < Number_Of_Working_Days ) {	
			Total_Emp_Working_Days++;
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
					Total_Emp_Working_Hours += Emp_Hours;
					System.out.println("Total Working days " + Total_Emp_Working_Days + " Total Working Hours:" + Total_Emp_Working_Hours  );
				}
					Total_Wage_Per_Month = Total_Emp_Working_Hours * Employee_Rate_Per_Hour;
					System.out.println("Total Employee Wage for company: " + company + " is: " + Total_Wage_Per_Month );
					return Total_Wage_Per_Month;
		}
	
	
	//main Method 
		public static void main(String args[]) {
			System.out.println("*****Welcome to Employee Wage Computation*****");
			empComputation("c&w", 20, 10, 50);
			System.out.println(" ");
			empComputation("Wipro", 15, 15, 75);
		}
		
}
