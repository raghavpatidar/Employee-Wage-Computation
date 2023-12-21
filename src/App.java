public class App {
    public static void main(String[] args) {

        EmpWageBuilder empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage("companyA", 20, 20, 100);
        empWageBuilder.addCompanyEmpWage("companyB", 25, 25, 120);
        empWageBuilder.addCompanyEmpWage("companyC", 15, 18, 80);
        empWageBuilder.addCompanyEmpWage("companyD", 26, 17, 115);

        empWageBuilder.computeWageForAllCompanies();

        empWageBuilder.getTotalWageByCompany("companyA");
        empWageBuilder.getTotalWageByCompany("companyB");
        empWageBuilder.getTotalWageByCompany("companyC");
        empWageBuilder.getTotalWageByCompany("companyD");
        empWageBuilder.getTotalWageByCompany("companyE");

    }
}