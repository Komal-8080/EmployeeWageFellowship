package employeeWageFellowship;

public class EmployeeWageArray {
	public static final int Part_Time = 1;
	public static final int Full_Time = 2;
	
	private int Number_Of_Companies = 0;
	private CompanyEmpWage companyEmpWageArray[];
	
	public EmployeeWageArray() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}
	
	private void addCompanyEmpWage(String company,int Employee_Rate_Per_Hour,int Number_Of_Working_Days,int Maximum_Hours_In_Month) {
		companyEmpWageArray[Number_Of_Companies] = new CompanyEmpWage(company, Employee_Rate_Per_Hour, Number_Of_Working_Days, Maximum_Hours_In_Month);
	    Number_Of_Companies++;
	}
	
	private void empComputation( ) {
		for(int i=0; i < Number_Of_Companies; i++ ) {
			companyEmpWageArray[i].setTotalWagePerMonth(this.empComputation(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
		
	}
	
	public int empComputation(CompanyEmpWage companyEmpWage) {	
		int Emp_Hours = 0;
		int Emp_Wage = 0;
		int Total_Emp_Working_Hours = 0;
		int Total_Emp_Working_Days = 0;
		
		//Computation
		while (Total_Emp_Working_Hours <= companyEmpWage.Maximum_Hours_In_Month && Total_Emp_Working_Days < companyEmpWage.Number_Of_Working_Days ) {	
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
					return Total_Emp_Working_Hours * companyEmpWage.Employee_Rate_Per_Hour;
		}
	
	
	//main Method 
		public static void main(String args[]) {
			System.out.println("*****Welcome to Employee Wage Computation*****");
			EmployeeWageArray employeeWage = new EmployeeWageArray();
			employeeWage.addCompanyEmpWage("Wipro",20,15,50);
			employeeWage.addCompanyEmpWage("CNW",20,20,75);
			employeeWage.empComputation();
					
		}
		
}
