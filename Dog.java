public class Dog extends AbstractClass{
    static String Dog;

    public static void main(String[] args){
       Dog dog = new Dog("ashiru");

       dog.pooo();
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void pooo() {
        System.out.println("Hi");
        printName();
    }


}
