package Builder;

public class Student {
    String name;
    int age;
    String universityName;
    public Student(Helper helper){
        this.name=helper.name;
        if(helper.age>100){
            throw new IllegalArgumentException("Age can't be grater than 100");
        }
        this.universityName= helper.universityName;
    }
}
