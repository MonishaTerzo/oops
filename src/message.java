public class message extends  saving {
    int money;
   //...............Messege for avings account.................
    message(){
        System.out.println("Your balance is checked in the ATM of canara bank .....if it is not u kindly contact the bank....");
    }
    message(int balance,int money){
        super();
        this.money=money;
        int availablebalance=balance-money;
        System.out.println("Dear customer: ");
        System.out.println("      from your account no XXXXXXX the amount of "+money+" is withdrawn  and your available balance is " +availablebalance);
    }
    message(int depo){
        System.out.println("A money of "+depo+" is deposited to your account....");
    }

}
