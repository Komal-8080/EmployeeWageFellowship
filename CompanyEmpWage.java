package employeeWageFellowship;

public class CompanyEmpWage {

	public final String company;
	public final int Employee_Rate_Per_Hour;
	public final int Number_Of_Working_Days;
	public final int Maximum_Hours_In_Month;
	public int totalWagePerMonth;
		
	public CompanyEmpWage(String company,int Employee_Rate_Per_Hour,int Number_Of_Working_Days,int Maximum_Hours_In_Month) {
		this.company = company;
		this.Employee_Rate_Per_Hour = Employee_Rate_Per_Hour;
		this.Number_Of_Working_Days = Number_Of_Working_Days;
		this.Maximum_Hours_In_Month = Maximum_Hours_In_Month;
	}
	
	public void setTotalWagePerMonth(int totalWagePerMonth) {
		this.totalWagePerMonth = totalWagePerMonth;
	}
	
	@Override
	public String toString() {
	return "Total Employee Wage for company: " + company + " is: " + totalWagePerMonth ;
	}
	
}
