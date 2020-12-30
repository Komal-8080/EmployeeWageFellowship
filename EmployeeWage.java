package employeeWageFellowship;


public class EmployeeWage {
	
	public static final int Part_Time = 1;
	public static final int Full_Time = 2;
	
	private final String company;
	private final int Employee_Rate_Per_Hour;
	private final int Number_Of_Working_Days;
	private final int Maximum_Hours_In_Month;
	int Total_Wage_Per_Month;
	
	public EmployeeWage(String company,int Employee_Rate_Per_Hour,int Number_Of_Working_Days,int Maximum_Hours_In_Month) {
		this.company = company;
		this.Employee_Rate_Per_Hour = Employee_Rate_Per_Hour;
		this.Number_Of_Working_Days = Number_Of_Working_Days;
		this.Maximum_Hours_In_Month = Maximum_Hours_In_Month;
	}	
	
	public void empComputation( ) {	
		int Emp_Hours = 0;
		int Emp_Wage = 0;
		int Total_Emp_Working_Hours = 0;
		int Total_Emp_Working_Days = 0;
		
		//Computation
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
		}
	
	public String toString() {
	return "Total Employee Wage for company: " + company + " is: " + Total_Wage_Per_Month ;
	}
	
	//main Method 
		public static void main(String args[]) {
			System.out.println("*****Welcome to Employee Wage Computation*****");
			System.out.println("");
			EmployeeWage cnw = new EmployeeWage("CNW", 20, 10, 50);
			EmployeeWage wipro = new EmployeeWage("Wipro", 15, 15, 75);
			cnw.empComputation( );
			System.out.println(cnw);
			System.out.println("");
			wipro.empComputation( );
			System.out.println(wipro);
		
		}
		
}
