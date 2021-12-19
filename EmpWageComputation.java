public class EmpWageComputation {
	 public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

	private final  String company;
	private final  int empPerHour;
	private final  int numOfWorkingDays;
	private final  int maxHoursPerMonth;
	private int totalEmpWage;


	public static int computeEmpWage(String company, int empRatePerHour,
									 int numOfWorkingDays, int maxHoursPerMonth) {
			this.company = company;
			this.empPerHour = empPerHour;
			this.numOfWorkingDays =numOfWorkingDays;
			this.maxHoursPerMonth=maxHoursPerMonth;
	}
	public void computeEmpWage(){
			int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
			while ( totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS ) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch (empCheck){
				case IS_PART_TIME:
								empHrs = 4;
								break;
				case IS_FULL_TIME:
								empHrs=8;
								break;
				default:
					empHrs=0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Days#: " + totalWorkingDays + " Emp Hr: " +empHrs);
		}
		int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
	}
	public string toString(){
		return "Total Emp Wage for Company : " + company + "is" + totalEmpWage;
	}
	public static void main(String[] args) {
		EmpWageBuilderObject dmart = new EmpWageBuilderObject("DMart", 20 , 2, 10);
		EmpWageBuilderObject reliance = new EmpWageBuilderObject("reliance", 10 , 4, 20);
		dmart.computeEmpWage();
		System.out.println(dmart);
		reliance.computeEmpWage();
		System.out.println(reliance);
	}
