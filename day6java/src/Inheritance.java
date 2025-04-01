// Parent class (Superclass)
class Animal {
    // Fields
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
    public  void eat(){
        System.out.println(name+"is eating");
    }
}

// Child class (Subclass)
class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        // Calling parent class constructor
        super(name);
    }

    // Method overriding
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Creating object of the subclass (Dog)
        Dog dog = new Dog("Buddy");

        // Calling overridden method
        dog.makeSound();  // Output: Woof! Woof!

        // Accessing inherited field
        System.out.println("Dog's name: " + dog.name);  // Output: Dog's name: Buddy
    }
}

