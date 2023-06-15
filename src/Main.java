
//.......................In this example parent buy a loan for his daughter and son studies ...........
//.................A parent before buying loan he dont know how many years he want to  pay the loan .It is based on the son and daughters income............

public class Main {

    public static void main(String[] args) {
     son son=new son();
     son.loan(30000);
     son.income(250);
     son.years_of_loan(4);
     son.years_to_pay();
        daughter dau=new daughter();
        dau.loan(75000);
        dau.income(2500);
        dau.years_of_loan(4);
        dau.years_to_pay();

    }
}