package Helper;

public class Client {
    public static void main(String[] args){
        Helper helper = new Helper();
        helper.name = "Jalal";
        helper.age=22;
        helper.universityName="OU";

        Student st = new Student(helper);

        System.out.println("Debug");
    }
}