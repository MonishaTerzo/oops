
//...........................MONISHA'S ......SIMPLE ATM PROJECT OF CANARA BANK..................................//
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int acc=0;
        int pin=0;


        //account details in hashmap (instead of database for example purpose i use hashmap )
        HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
        //account number is key
        data.put(11011,1004);
        data.put(110112,2003);
        data.put(110113,5004);
        Scanner sc=new Scanner(System.in);
        int verified=0;
        System.out.println("WELCOME TO CANARA BANK");
        System.out.print("please select the language(press 1(english) or press 0(tamil)) : ");
        int u=sc.nextInt();
        switch(u){
            case 1:
                System.out.println(("enter the account number and pin number"));
                System.out.print("Enter account number : ");
                acc=sc.nextInt();
                System.out.print("Enter pin number : ");
                 pin=sc.nextInt();
                 break;
            default:
                System.out.println("enter 0 or 1");
    }
    //check validity

        if(data.containsKey(acc)){
            if(data.get(acc)==pin){
                verified=1;
                System.out.println("your details verified....processing.........");
                System.out.println("processing.............");

}
        else{
                System.out.println("your pin number is wrong");
            } }
        else{
            System.out.println("please enter a valid account number");}
        if(verified==1){
            //verfication of name

              verification detail=new verification(pin);
            System.out.println("check your name  :  ");
            String nameverification=detail.checkdetails();
            System.out.println("Your name is  : "+nameverification);

            System.out.println("Enter the type of the acoount ");
            System.out.println("1:savings account");
            System.out.println("2:current deposit account");
            int mn=sc.nextInt();

                if(mn==1){
                    saving sav=new saving();

                    System.out.println("1:withdrawl");
            System.out.println("2:checkbalance");
            System.out.println("3:deposit");
            int check=sc.nextInt();
            if(check==1){
                System.out.println("Enter the amount to withdraw");
                int money=sc.nextInt();
                String gh=sav.withdrawl(money);
                System.out.println("hi.."+ gh+" your money is withdrawl...");
                System.out.println();
                //message sended to the customer through phn no........
                message mm=new message(money,100000);
            }
            else if(check==2){
               int n= sav.balance;
                System.out.println("you have amount of rupess "+n + " in your account ");
                //to give balance check alert
                System.out.println();
            message mj=new message();}
            else{
                System.out.print("Enter the amount you want deposit  : ");
                int mm=sc.nextInt();
                sav.deposit(mm);
                System.out.println("your money gets deposited...");
                System.out.println();
            message kk=new message(mm);}}


                else{
                    current cur=new current();
                    System.out.println("1:withdrawl");
                    System.out.println("2:checkbalance");
                    System.out.println("3:deposit ");
                    int check=sc.nextInt();
                    if(check==1){
                        System.out.println("Enter the amount to withdraw");
                        int money=sc.nextInt();
                        String gh=cur.withdrawl(money);
                        System.out.println("hi.."+ gh+" your money is withdrawl...");
                        System.out.println();
                        //message sended to the customer through phn no........
                        //different class is created to make the different message that money is transfered from current account
                        message1 mm=new message1(money,100000);
                    }
                    else if(check==2){
                        int n= cur.balance;
                        System.out.println("you have amount of rupess "+n + " in your account ");
                        System.out.println();
                        //to give balance check alert
                        message1 mj=new message1();}
                    else{
                        System.out.print("Enter the amount you want deposit  : ");
                        int mm=sc.nextInt();
                        cur.deposit(mm);
                        System.out.println("your money gets deposited...");
                        System.out.println();
                        message1 kk=new message1(mm);}}
        }
            }}