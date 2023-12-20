public class App {

    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_TIME = 8;

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome To Employee Wage Computation Program");

        if (isPresent()) {
            System.out.println("Employee is Present and it's Daily Wage is : " + calculateWage(FULL_TIME));
        } else
            System.out.println("Employe is Absent  and it's Daily Wage is : " + calculateWage(0));
    }

    private static int calculateWage(int time) {
        return WAGE_PER_HOUR * time;
    }

    private static boolean isPresent() {

        return Math.random() > 0.5;
    }

}
