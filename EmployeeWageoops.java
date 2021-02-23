import java.util.Random;

public class EmployeeWageoops {

        public static void main(String[] args) {

                System.out.println("\nWelcome to Employee Wage Computation Program!\n");

                Employee emp = new Employee();
                emp.computeEmpWage();

        }

}

class Employee {
        Random random = new Random();

        public int wageHour = 20;
        public int fullDay = 8;
		  public int halfDay = 4;
        public int totalWage = 0;
        public int dailyWage = 0;

        public boolean attendance() {
                int rand = random.nextInt(2);

                if(rand == 1) {
                        return true;

                } else {
                        return false;
                }
        }

        public void dailyEmpWage() {
                int t = random.nextInt(2);

                switch (t) {
                case 0:
                        dailyWage = fullDay * wageHour;
                        totalWage += dailyWage;
                        break;


						case 1:
								dailyWage = halfDay * wageHour;
								totalWage += dailyWage;
								break;


                default:
                        System.err.println("Invalid Operation!");
                }
        }

        protected void computeEmpWage() {

                for (int i = 1; i <= 1; i++) {
                        if (attendance()) {
                                dailyEmpWage();
                                System.out.println(" " + i + "  " + "Present" + " " + dailyWage + "     " + totalWage);

                        } else {
                                dailyWage = 0;
                                System.out.println(" " + i + "  " + "Absent" + " " + dailyWage + "      " + totalWage);
                        }
                }
}
}

