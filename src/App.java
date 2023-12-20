public class App {

    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_TIME = 8;
    public static final int PART_TIME = 4;

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome To Employee Wage Computation Program");

        int employeeType = isPresent();

        if (employeeType == 1) {
            System.out.println("Employee is FULL Time and it's Daily Wage is : " + calculateWage(FULL_TIME));
        } else if (employeeType == 2) {
            System.out.println("Employee is PART Time and it's Daily Wage is : " + calculateWage(PART_TIME));
        } else
            System.out.println("Employe is Absent  and it's Daily Wage is : " + calculateWage(0));
    }

    private static int calculateWage(int time) {
        return WAGE_PER_HOUR * time;
    }

    private static int isPresent() {

        return (int) (Math.random() * 3) + 1;
    }

}
