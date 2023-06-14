public class it_employee extends employee{
    String company_name;
    it_employee(){
        System.out.println("hi developer");
    }
    it_employee(String name,int age,String company_name){
        super(name,age);
this.company_name=company_name;    }

    public void aboutdeveloper(){
        System.out.println("Hi I am "+ this.name + "and my age is "+ this.age + ".I am working in company "+ this.company_name);


    }}

