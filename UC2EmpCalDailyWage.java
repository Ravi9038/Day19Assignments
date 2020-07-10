

class EmpCalDailyWage{

	public static void main(String [] args){

		int isFullTime = 1;
		int isPartTime = 2;
		int empRatePerHr = 20;
		int salary = 0;

		int randVal = (int) (Math.random()* 2)+1;


		if (randVal == isFullTime){

			int empHrs = 8;
			salary = empHrs * empRatePerHr;
		       System.out.println("Salary Full Time = "+salary);	
		}else{

			System.out.println("Employee is Absent");
		}
	}
}
