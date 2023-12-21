import java.util.ArrayList;

public class CompanyEmpWage {

    private String companyname;
    private int WAGE_PER_HOUR;
    private int WORKING_DAY_IN_MONTH;
    private int TOTAL_WORKING_HOUR;
    private int totalWage;
    ArrayList<Integer> dailyWage;

    public CompanyEmpWage(String companyname, int wAGE_PER_HOUR, int wORKING_DAY_IN_MONTH, int tOTAL_WORKING_HOUR) {
        this.WAGE_PER_HOUR = wAGE_PER_HOUR;
        this.WORKING_DAY_IN_MONTH = wORKING_DAY_IN_MONTH;
        this.TOTAL_WORKING_HOUR = tOTAL_WORKING_HOUR;
        this.companyname = companyname;
        this.dailyWage = new ArrayList<>();
    }

    public void addDailyWage(int wage) {
        dailyWage.add(wage);
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    public String getCompanyname() {
        return companyname;
    }

    public int getWAGE_PER_HOUR() {
        return WAGE_PER_HOUR;
    }

    public int getWORKING_DAY_IN_MONTH() {
        return WORKING_DAY_IN_MONTH;
    }

    public int getTOTAL_WORKING_HOUR() {
        return TOTAL_WORKING_HOUR;
    }

    public int getTotalWage() {
        return totalWage;
    }

    public String toString() {
        return "Total Wage for Company: " + this.companyname + " is " + totalWage;
    }

}
