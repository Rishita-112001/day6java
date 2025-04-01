class Animal4{
    String name;

    Animal4(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog4 extends Animal4 {
    Dog4(String name) {
        super(name);  // Pass the name to the parent class (Animal3)
    }

    @Override
    public void eat() {
        super.eat();  // Call the eat() method from Animal3
        System.out.println(name + " looks good while eating.");
    }

    public void bark() {
        System.out.println("barking");
    }
}

class Bird1 extends Animal4 {
    Bird1(String name) {
        super(name);  // Pass the name to the parent class (Animal3)
    }

    @Override
    public void eat() {
        super.eat();  // Call the eat() method from Animal3
        System.out.println(name + " looks good while eating.");
    }

    public void fly() {
        System.out.println("flying");
    }
}

class Puppy1 extends Dog4 {
    String breed;

    Puppy1(String name, String breed) {
        super(name);  // Pass the name to the parent class (Dog3)
        this.breed = breed;
    }

    public void name() {
        // Print the mother's name (the name of Dog3, which is inherited from Animal3)
        System.out.println("The name of the mother is: " + super.name);  // Use 'super.name' to refer to the mother's name

        // Print the puppy's name
        System.out.println("The name of the puppy is: " + super.name);  // Here, 'super.name' refers to the same puppy's name
    }

    public void breed() {
        System.out.println("The breed is: " + breed);
    }
}

class InheritanceDemo1 {
    public static void main(String[] args) {
        Dog4 d = new Dog4("Lab");
        d.eat();
        d.bark();

        Bird1 b = new Bird1("Dove");
        b.eat();
        b.fly();

        Puppy1 p = new Puppy1("Bruno", "Golden Retriever");
        p.breed();
        p.eat();
        p.bark();
        p.name();
    }
}
