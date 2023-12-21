public class App {
    public static void main(String[] args) {

        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage("companyA", 20, 20, 100);
        empWageBuilder.addCompanyEmpWage("companyA", 25, 25, 120);

        empWageBuilder.computeWageForAllCompanies();

        // EmpWageBuilder companyA = new EmpWageBuilder("companyA", 20, 20, 100);
        // companyA.computeEmployeWage();
        // System.out.println("Monthly Wage for CompanyA" + companyA.getMonthlyWage() +
        // "\n\n");

        // EmpWageBuilder companyB = new EmpWageBuilder("companyB", 25, 25, 120);
        // companyB.computeEmployeWage();
        // System.out.println("Monthly Wage for CompanyB" + companyB.getMonthlyWage());
    }
}