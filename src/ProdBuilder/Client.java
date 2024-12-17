package ProdBuilder;

public class Client {
    public static void main(String[] args) {
        Student st = Student.getBuilder().setAge(22).setName("Jalal").build();
        System.out.print("DeBug");
    }
}
