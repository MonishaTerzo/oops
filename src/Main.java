//......................In this example company profit is changed by indirect set method..................
public class Main {
    public static void main(String[] args) {
        Encapsulation e=new Encapsulation(12-0000000,"aaa",3400000);
       //to get the profit of compant
       int profit= e.getProfit();
        System.out.println(profit);
        //to change the profit of the company
        e.setProfit(890000);
        int changedprofit=e.getProfit();
        System.out.println(changedprofit);
        }
    }
