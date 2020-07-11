

class EmpWageSwitchCase{

	public static void main(String [] args){

		int empRatePerHr = 20;
		int empHrs = 0;
		int salary = 0;
		int empWorkingDays = 20;
		int totalSal = 0;

		int empCheck = (int) (Math.random()* 3);

		switch(empCheck){

			case 1 :
				System.out.println("Full Time Salary");
				empHrs = 8;
				break;
			case 2 :
				System.out.println("Half Time Salary");
				empHrs = 4;
				break;
			default :
				System.out.println("When Employee is Absent");
				empHrs = 0;
		}

		salary = empHrs* empRatePerHr;
		System.out.println("Calculate Salary = "+salary);
	}
}
