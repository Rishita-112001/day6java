public class SingleInheritance {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        dog.eat();  // Inherited method from Animal
        dog.bark(); // Method of Dog
    }
}
class Animal1 {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog1 extends Animal1 {
    void bark() {
        System.out.println("The dog barks.");
    }
}