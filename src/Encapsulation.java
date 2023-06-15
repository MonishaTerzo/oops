public class Encapsulation {
    private int  company_income;
    private String company_shareholder;
    private int profit;


    public Encapsulation(int company_income, String company_shareholder, int profit) {
        this.company_income = company_income;
        this.company_shareholder = company_shareholder;
        this.profit = profit;
    }

    public int getCompany_income() {
        return company_income;
    }

    public String getCompany_shareholder() {
        return company_shareholder;
    }

    public int getProfit() {
        return profit;
    }

    public void setCompany_income(int company_income) {
        this.company_income = company_income;
    }

    public void setCompany_shareholder(String company_shareholder) {
        this.company_shareholder = company_shareholder;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }
}
