public class Student {

    String name;
    int age;
    String color;
    char sex;

    public void Eating() {
        System.out.print("Eating");
    }

    public  void Drinking() {
        System.out.print("Drinking");
    }

    public void Running() {
        System.out.print("Running");
    }

    public Student(String name, int age, String color, char sex) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
    }
}
