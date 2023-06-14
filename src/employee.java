public class employee extends human{
    int emp_id;

    employee(){
        System.out.println("hi...hardworker.......");
    }
    employee(String name,int id){
        super(name);
        this.emp_id=id;
    }
    public void employeeid(){
        System.out.println("My name is "+this.name + " and my id is "+ this.emp_id);
    }
}
