package employeeWageFellowship;

import java.util.HashMap;
import java.util.LinkedList;

class EmpWageBuilder implements ComputeEmpWage {

	public static final int Part_Time = 1;
	public static final int Full_Time = 2;

	private int Number_Of_Companies = 0;
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private HashMap<String, CompanyEmpWage> companyToEmpWageMap;

	public EmpWageBuilder() {
		companyEmpWageList = new LinkedList<>();
		companyToEmpWageMap = new HashMap<>();
	}

	@Override
	public void addCompanyEmpWage(String company, int Employee_Rate_Per_Hour, int Number_Of_Working_Days,
			int Maximum_Hours_In_Month) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, Employee_Rate_Per_Hour, Number_Of_Working_Days,
				Maximum_Hours_In_Month);
		companyEmpWageList.add(companyEmpWage);
		companyToEmpWageMap.put(company, companyEmpWage);
	}

	@Override
	public void empComputation() {
		for (int i = 0; i < companyEmpWageList.size(); i++) {
			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setTotalWagePerMonth(this.empComputation(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}

	@Override
	public int getTotalWage(String company) {
		return companyToEmpWageMap.get(company).totalWagePerMonth;
	}

	public int empComputation(CompanyEmpWage companyEmpWage) {
		int Emp_Hours = 0;
		int Emp_Wage = 0;
		int Total_Emp_Working_Hours = 0;
		int Total_Emp_Working_Days = 0;

		// Computation
		while (Total_Emp_Working_Hours <= companyEmpWage.Maximum_Hours_In_Month
				&& Total_Emp_Working_Days < companyEmpWage.Number_Of_Working_Days) {
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
			System.out.println("Day : " + Total_Emp_Working_Days + " Emp hr: " + Total_Emp_Working_Hours);
		}
		return Total_Emp_Working_Hours * companyEmpWage.Employee_Rate_Per_Hour;
	}

}
