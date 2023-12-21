public class EmpWageBuilder {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int ABSENT = 3;
    public static final int FULL_TIME_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;
    private String companyname;
    private int WAGE_PER_HOUR;
    private int WORKING_DAY_IN_MONTH;
    private int TOTAL_WORKING_HOUR;
    private int totalWage;

    public EmpWageBuilder(String companyname, int wAGE_PER_HOUR, int wORKING_DAY_IN_MONTH, int tOTAL_WORKING_HOUR) {
        this.companyname = companyname;
        this.WAGE_PER_HOUR = wAGE_PER_HOUR;
        this.WORKING_DAY_IN_MONTH = wORKING_DAY_IN_MONTH;
        this.TOTAL_WORKING_HOUR = tOTAL_WORKING_HOUR;
    }

    public void computeEmployeWage() {

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
        this.totalWage = totalMonthWage;
    }

    private int calculateDailyWage(int time, int WAGE_PER_HOUR) {
        return WAGE_PER_HOUR * time;
    }

    private int isPresent() {
        return (int) (Math.random() * 3) + 1;
    }

    public int getMonthlyWage() {
        return this.totalWage;
    }

}
