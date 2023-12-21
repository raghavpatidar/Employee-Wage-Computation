public class App {

    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int ABSENT = 3;
    // public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_TIME_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;
    // public static final int WORKING_DAY_IN_MONTH = 20;
    // public static final int TOTAL_WORKING_HOUR = 100;

    public static void computeEmployeWage(String companyname, int WAGE_PER_HOUR, int WORKING_DAY_IN_MONTH,
            int TOTAL_WORKING_HOUR) {

        System.out.println("Welcome To Employee Wage Computation Program For " + companyname);

        int totalMonthWage = 0;
        int workingDay = 0;
        int workingHour = 0;
        while (workingDay < WORKING_DAY_IN_MONTH && workingHour < TOTAL_WORKING_HOUR) {
            int employeeType = isPresent();
            switch (employeeType) {
                case FULL_TIME:
                    System.out.println(
                            "Employee is FullTime DailyWage: " + calculateDailyWage(FULL_TIME_HOUR, WAGE_PER_HOUR));
                    totalMonthWage += calculateDailyWage(FULL_TIME_HOUR, WAGE_PER_HOUR);
                    workingHour += FULL_TIME_HOUR;
                    workingDay++;
                    break;
                case PART_TIME:
                    System.out.println(
                            "Employee is PartTime DailyWage: " + calculateDailyWage(PART_TIME_HOUR, WAGE_PER_HOUR));
                    totalMonthWage += calculateDailyWage(PART_TIME_HOUR, WAGE_PER_HOUR);
                    workingHour += PART_TIME_HOUR;
                    workingDay++;
                    break;
                case ABSENT:
                    System.out.println("Employe is Absent DailyWage: " + calculateDailyWage(0, WAGE_PER_HOUR));
                    break;

                default:
                    System.out.println("This Person Is not An Employee");
                    break;
            }

            if (workingHour >= TOTAL_WORKING_HOUR) {
                workingHour = TOTAL_WORKING_HOUR;
                break;
            }

        }
        System.out.println("Total Wage For Month : " + totalMonthWage);
        System.out.println("Total Time : " + workingHour);
        System.out.println("Total Days : " + workingDay + "\n");
    }

    public static void main(String[] args) throws Exception {
        computeEmployeWage("CompanyA", 20, 20, 100);
        computeEmployeWage("CompanyB", 25, 25, 120);
    }

    private static int calculateDailyWage(int time, int WAGE_PER_HOUR) {
        return WAGE_PER_HOUR * time;
    }

    private static int isPresent() {

        return (int) (Math.random() * 3) + 1;
    }

}
