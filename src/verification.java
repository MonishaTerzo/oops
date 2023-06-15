import java.util.*;

public class verification {
      //store the three pin values and name
         int p1,p2,p3;
         String n1,n2,n3;
       static   String name;

          verification(){
              System.out.println("kindly check your  details..........");
          }
    verification(int n){
        if(n==1004) {
            this.p1=1004;
            this.n1="monisha";
           this. name="monisha";
        }
        else if(n==2003){
            this.p2=2002;
           this.n2="aparna";
         this.name="aparna";
        }
        else{
            this.p3=n;
           this.n3="pavi";
        this.name="pavi";}
    }
    public static String checkdetails(){
        return name;
    }
    public static void gettingdetails(int n){
        if(n==1){
            saving sav=new saving(); }
        else{
            current cur=new current();}
    }


}
