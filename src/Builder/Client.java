package Builder;

public class Client {
    public static void main(String[] args) {
        Helper helper = new Helper();
        helper.name = "Jalal";
        helper.age=22;
        helper.universityName = "Osmania University";

        Student student = new Student(helper);

        System.out.println("Debug");
    }
}
