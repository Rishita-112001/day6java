public class SuperKeyword {
    public static void main(String[] args){
        Dog2 dog = new Dog2("Buddy");
        dog.speak();
        dog.display();
    }
}
class Animal2 {
    String name = "Generic Animal";

    public Animal2(String name) {
        this.name = name;
    }

    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog2 extends Animal2 {
    String name = "Dog";

    public Dog2(String name) {
        super(name);  // Calling the constructor of Animal
    }

    void speak() {
        super.speak();  // Calling superclass method
        System.out.println("Dog barks");
    }

    void display() {
        System.out.println("Superclass name: " + super.name);  // Accessing superclass field
        System.out.println("Subclass name: " + name);  // Accessing subclass field
    }
}