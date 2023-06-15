import java.util.*;
public class saving extends verification{
    int balance;
    int a=0;
    saving(){
        this.balance=100000;
    }
    public String withdrawl(int money){
        balance=balance-money;
        String h=verification.checkdetails();
        return h;
    }
    public int balance(){
        return balance;
    }
    public void deposit(int mm){
        balance=balance+mm;
    }

    //sending the messege to the customers phonr number



}
