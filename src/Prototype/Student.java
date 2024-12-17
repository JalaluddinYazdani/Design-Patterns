package Prototype;

public class Student implements Prototype<Student>{
    private String name;
    private int age;
    private double percentage;
    String univName;
    String avgPercentage;

    Student(){}
    Student(Student student){
        this.name = student.name;
        this.age=student.age;
        this.percentage= student.percentage;
        this.univName=student.univName;
        this.avgPercentage= student.avgPercentage;
    }
    @Override
    public Student clone() {
        return new Student(this);
    }
}
