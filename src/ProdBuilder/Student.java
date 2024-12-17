package ProdBuilder;

public class Student {
    String name;
    int age;
    String gender;
    String universityName;
    String gradYear;
    double cgpa;
    String address;

    public Student(Builder builder){
        if(builder.getAge()>100){
            throw new IllegalArgumentException("Age cant be greater than 100");
        }
        this.name= builder.getName();
    }
    public static Builder getBuilder(){
        return new Builder();
    }


    static class Builder{
        private String name;
        private int age;
        private String gender;
        private String universityName;
        private String gradYear;
        private double cgpa;
        private String address;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public String getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(String gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public double getCgpa() {
            return cgpa;
        }

        public Builder setCgpa(double cgpa) {
            this.cgpa = cgpa;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
