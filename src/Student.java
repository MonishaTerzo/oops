public class Student extends human{
    int roll_no;
    String school_name;
    String school_address;
    int rank;
    Student(String  name,int age,int roll_no){
        super(name,age);
        this.roll_no=roll_no;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    public void intro(){
        System.out.println("I am "+name + " studying in "+school_name+"and i got "+rank+" rank");
    }

   // public void school_near(String address){
   //     this.school_address=address;
    //    if (this.living_city.equals(school_address)){
      //      System.out.println("your school is near to u");
    //}
}
