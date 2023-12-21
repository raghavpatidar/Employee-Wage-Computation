/**
 * IEmployeeWageComputation
 */
public interface IEmployeeWageComputation {

    public void addCompanyEmpWage(String conpanyName, int wagePerHour, int workingDayInMonth, int totalWorkingHour);

    public int computeEmployeWage(CompanyEmpWage company);

    public void computeWageForAllCompanies();

    public void getTotalWageByCompany(String name);
}