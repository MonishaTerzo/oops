import java.util.*;
public class human {
    String name;
    int age;
    String living_city;
    int aadhar_no;
    int phn_no;
    int alternate_no;
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLiving_city(String living_city) {
        this.living_city = living_city;
    }

    public void setAadhar_no(int aadhar_no) {
        this.aadhar_no = aadhar_no;
    }

    public String getLiving_city() {
        return living_city;
    }

    public int getAadhar_no() {
        return aadhar_no;
    }
    human(){
        System.out.println("hi....");
    }

    human(String name, int age, String city, int aadhar_no){
        this.name=name;
        this.age=age;
        this.living_city=city;
        this.aadhar_no=aadhar_no;

    }
    human(String name,int age){
        this.name=name;
        this.age=age;
    }

    human(String name){
        this.name=name;
    }
    public void intro(String name){
        System.out.println("my name is"+name);
    }

    public void birthday(){
        this.age+=1;
    }

    public void alternate_no(int phn_no){
        alternate_no=phn_no;

    }


}
