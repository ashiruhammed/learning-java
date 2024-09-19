public abstract class AbstractClass {

    String name;
    int age;

    abstract public void pooo();

    public AbstractClass(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.print(name);
    }

}
