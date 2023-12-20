public class App {

    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_TIME = 8;
    public static final int PART_TIME = 4;
    public static final int WORKING_DAY_IN_MONTH = 20;
    public static final int TOTAL_WORKING_HOUR = 100;

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome To Employee Wage Computation Program");

        int totalMonthWage = 0;
        int workingDay = 0;
        int workingHour = 0;
        while (workingDay < WORKING_DAY_IN_MONTH || workingHour < TOTAL_WORKING_HOUR) {
            int employeeType = isPresent();
            switch (employeeType) {
                case 1:
                    System.out.println("Employee is FullTime DailyWage: " + calculateWage(FULL_TIME));
                    totalMonthWage += calculateWage(FULL_TIME);
                    workingDay++;
                    workingHour += FULL_TIME;
                    break;
                case 2:
                    System.out.println("Employee is PartTime DailyWage: " + calculateWage(PART_TIME));
                    totalMonthWage += calculateWage(PART_TIME);
                    workingHour += PART_TIME;
                    workingDay++;
                    break;
                case 3:
                    System.out.println("Employe is Absent DailyWage: " + calculateWage(0));
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
        System.out.println("Total Days : " + workingDay);
    }

    private static int calculateWage(int time) {
        return WAGE_PER_HOUR * time;
    }

    private static int isPresent() {

        return (int) (Math.random() * 3) + 1;
    }

}
