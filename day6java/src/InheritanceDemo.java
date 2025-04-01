class Animal3 {
    String name;
    Animal3(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog3 extends Animal3 {
    Dog3(String name) {
        super(name);
    }
    @Override
    public void eat(){
        super.eat();
        System.out.println(name+" looks good while eating.");
    }

    public void bark() {
        System.out.println("barking");
    }
}

class Bird extends Animal3 {
    Bird(String name) {
        super(name);
    }
    @Override
    public void eat(){
        super.eat();
        System.out.println(name+" looks good while eating.");
    }
    public void fly() {
        System.out.println("flying");
    }
}

class Puppy extends Dog3 {
    String breed;

    Puppy(String name,String breed) {
        super(name);
        this.breed = breed;
    }
    public void name() {
        System.out.println("the name of the mother is: " + super.name);
        System.out.println("the name of the puppy is: " + super.name);
    }
    public void breed() {
        System.out.println("The breed is: " + breed);
    }
}

class InheritanceDemo {
    public static void main(String[] args) {
        Dog3 d = new Dog3("Lab");
        d.eat();
        d.bark();

        Bird b = new Bird("Dove");
        b.eat();
        b.fly();

        Puppy p = new Puppy("Bruno","Golden Retriever");
        p.breed();
        p.eat();
        p.bark();
        p.name();
    }
}
