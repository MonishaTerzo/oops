//simple project to get the detils of terzo
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("do u want full company details (yes or no) or only want more important details: ");
        String n = sc.next();
        if (n.equals("yes")) {
            terzo com = new terzo();
            System.out.print("do u want to know the best startup company  : ");
            String g=sc.next();
            if(g.equals("yes")){
            com.best_startup();}
        }
        else{
            terzo comp=new terzo(100,15,true);
            System.out.print("do u want to know the best startup company  : ");
            comp.best_startup();

        }}
    static class terzo{
        int no_of_employees;
        int projects;
        String coe;
        boolean goodcompany;
        String[] employees = new String[2];
  //constructor when the user wants whole details about terzo
        terzo() {
            this.no_of_employees = 100;
            this.projects = 15;
            this.coe = "pradeep";
            this.goodcompany = true;
            this.employees[0] = "monisha ";
            this.employees[1] = "aparna";
            System.out.println("employees :"+no_of_employees);
            System.out.println("no of projects :"+projects);
            System.out.println("cofounder name : " +coe);
            System.out.println("is this a good company :"+goodcompany);
            System.out.print("some of employees in terzo :");
            System.out.println(Arrays.toString(employees));
        }
        //constructor when user wants only main details of terzo
        terzo(int no_of_employees,int projects,boolean goodcompany){
            this.no_of_employees=no_of_employees;
            this.projects=projects;
            this.goodcompany=true;
            System.out.println("employees : " +no_of_employees);
            System.out.println("no of projects : "+projects);
            System.out.println(goodcompany);



        }
        public void best_startup(){
            System.out.println("Terzo is the best start up company");
        }

        public String coename(){
            String s="pradeep";
            return s;}

        public int get_noofprojects(){
            int c=15;
            return c;
        }


    }
}