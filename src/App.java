public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome To Employee Wage Computation Program");

        if (isPresent()) {
            System.out.println("Employee is Present");
        } else
            System.out.println("Employe is Absent");
    }

    private static boolean isPresent() {

        return Math.random() > 0.5;
    }

}
