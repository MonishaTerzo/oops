//...................Messege for current accounnt.............

public class message1 {
    int money;
    message1(){
        System.out.println("Dear customer,");
        System.out.println("Your current account balance  is checked in the ATM of canara bank .....if it is not u kindly contact the bank....");
    }
    message1(int balance,int money){
        super();
        this.money=money;
        int availablebalance=balance-money;
        System.out.println("Dear customer: ");
        System.out.println("      from your current account no XXXXXXX the amount of "+money+" is withdrawn  and your available balance is " +availablebalance);
    }
    message1(int depo){
        System.out.println("A money of "+depo+" is deposited to your current deposit account....");
    }

}
