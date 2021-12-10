public class EmpWageComputation {

      final static int IS_FULL_TIME = 1;
      final static int EMP_RATE_PER_HOUR = 20;
		public static void main(String[] args){
      int empHrs = 0;
		int empWage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
			if ( empCheck == IS_FULL_TIME)
				empHrs = 8;
			else{
				System.out.println("Employee is Absent");
				}
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("Emp Wage:" + empWage);
	}
}
