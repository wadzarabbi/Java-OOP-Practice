
// Person.java
public class Person {

    private String fullName;
    private String course;
    private String email;

    public Person (String fullName, String course, String email) {
        this.fullName = fullName;
        this.course = course;
        this.email = email;
    }

    public String getFullname() {
        return fullName;
    }

    public void setFullname(String fullName) {
        this.fullName = fullName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
               "Fullname: " + fullName + "\n" +
               "Course: " + course + "\n" +
               "Email: " + email;
    }

    private String name;
    private String address;
    private int age;

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void intro() {
        System.out.println("Hello, my name is " + name + " based in " + address + " and I am " + age + " years old.");
    }

}

