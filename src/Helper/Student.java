package Helper;

public class Student {
    String name;
    int age;
    String gender;
    String universityName;
    String gradYear;
    double cgpa;
    String address;
    public Student(Helper helper){
        if(helper.age>100){
            throw new IllegalArgumentException("Age can't be greater than 100");
        }
        this.name = helper.name;
        this.gender=helper.gender;
        this.universityName=helper.universityName;
        this.gradYear= helper.gradYear;
        this.cgpa = helper.cgpa;
        this.address= helper.address;
    }
}
