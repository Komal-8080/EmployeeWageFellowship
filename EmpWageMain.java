package employeeWageFellowship;

import java.util.Scanner;

public class EmpWageMain {

	public static void main(String args[]) {
		
		Scanner Company = new Scanner(System.in);
		System.out.println("Enter Company name");
	String company = Company.nextLine();

	Scanner EmpRatePerHour = new Scanner(System.in);
                System.out.println("Enter Employee Rate Per Hour");
        int Employee_Rate_Per_Hour = EmpRatePerHour.nextInt();

	Scanner NumOfWorkingDays = new Scanner(System.in);
                System.out.println("Enter Number of working Days");
        int Number_Of_Working_Days = NumOfWorkingDays.nextInt();

	Scanner MaxHoursPerMonth = new Scanner(System.in);
                System.out.println("Enter Maximum Working Hours Per Month");
        int Maximum_Hours_In_Month = MaxHoursPerMonth.nextInt();


	ComputeEmpWage empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage( company, Employee_Rate_Per_Hour, Number_Of_Working_Days, Maximum_Hours_In_Month );
	empWageBuilder.empComputation();
        System.out.println("Total Wage for " +company+ "company: "+empWageBuilder.getTotalWage(company));
		
	}
}
