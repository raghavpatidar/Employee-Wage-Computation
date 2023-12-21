import java.util.ArrayList;

public class EmpWageBuilder {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int ABSENT = 3;
    public static final int FULL_TIME_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;

    ArrayList<CompanyEmpWage> companies;

    public EmpWageBuilder() {
        this.companies = new ArrayList<>();
    }

    public int computeEmployeWage(CompanyEmpWage company) {
        System.out.println("Computing monthly wage for company: " + company.getCompanyname());
        int totalMonthWage = 0;
        int workingDay = 0;
        int workingHour = 0;
        while (workingDay < company.getWORKING_DAY_IN_MONTH() && workingHour < company.getTOTAL_WORKING_HOUR()) {
            int employeeType = isPresent();
            switch (employeeType) {
                case FULL_TIME:
                    System.out.println(
                            "Employee is FullTime DailyWage: "
                                    + calculateDailyWage(FULL_TIME_HOUR, company.getWAGE_PER_HOUR()));
                    totalMonthWage += calculateDailyWage(FULL_TIME_HOUR, company.getWAGE_PER_HOUR());
                    workingHour += FULL_TIME_HOUR;
                    workingDay++;
                    break;
                case PART_TIME:
                    System.out.println(
                            "Employee is PartTime DailyWage: "
                                    + calculateDailyWage(PART_TIME_HOUR, company.getWAGE_PER_HOUR()));
                    totalMonthWage += calculateDailyWage(PART_TIME_HOUR, company.getWAGE_PER_HOUR());
                    workingHour += PART_TIME_HOUR;
                    workingDay++;
                    break;
                case ABSENT:
                    System.out.println(
                            "Employe is Absent DailyWage: " + calculateDailyWage(0, company.getWAGE_PER_HOUR()));
                    break;

                default:
                    System.out.println("This Person Is not An Employee");
                    break;
            }

            if (workingHour >= company.getTOTAL_WORKING_HOUR()) {
                workingHour = company.getTOTAL_WORKING_HOUR();
                break;
            }

        }
        System.out.println("Total Wage For Month : " + totalMonthWage);
        System.out.println("Total Time : " + workingHour);
        System.out.println("Total Days : " + workingDay + "\n");
        company.setTotalWage(totalMonthWage);
        return totalMonthWage;
    }

    public void addCompanyEmpWage(String conpanyName, int wagePerHour, int workingDayInMonth, int totalWorkingHour) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(conpanyName, wagePerHour, workingDayInMonth,
                totalWorkingHour);
        companies.add(companyEmpWage);
        System.out.println("Company Added Successfully");
    }

    public void computeWageForAllCompanies() {
        for (CompanyEmpWage company : companies) {
            company.setTotalWage(this.computeEmployeWage(company));
            System.out.println(company);
        }
    }

    private int calculateDailyWage(int time, int WAGE_PER_HOUR) {
        return WAGE_PER_HOUR * time;
    }

    private int isPresent() {
        return (int) (Math.random() * 3) + 1;
    }

}
