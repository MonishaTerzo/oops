import java.util.*;

// ****************************simple project on student or employee(it employee or government employee)***************************//
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        human h = new human();
        human hu = new human("monisha", 20, "erode", 3444);
        h.setLiving_city("erode");
        System.out.print("Are u a student/employee: ");
        String stu_emp = sc.next();
        if (stu_emp.equals("student")) {
            Student stu = new Student("monisha", 20, 63);
            stu.setSchool_name("bharathi");
            stu.setRank(1);
            stu.intro();
        } else if (stu_emp.equals("employee")) {
            employee emp=new employee();
            employee emp1=new employee("monisha",99);
            emp1.employeeid();
            System.out.print("are u a it or government employee : ");
            String  ty=sc.next();
            if(ty.equals("it")) {
                it_employee it1 = new it_employee("monisha", 20, "terzo");
                it1.aboutdeveloper();
            }else{
                government_employee gov=new government_employee("central");

            }
    }}}