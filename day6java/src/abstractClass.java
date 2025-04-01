interface Flyable{
    void fly();
}
abstract class animalClass{
    String name;
    animalClass(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println(name +" is eating");
    }
    abstract void sound();

}
class dogClass extends animalClass{
    dogClass(String name){
        super(name);
    }
    void sound(){
        System.out.println(name +" is barking");
    }
}
class birdy extends animalClass implements Flyable{
    birdy(String name){
        super(name);
    }
    void sound(){
        System.out.println(name +" is chirping");
    }
    public void fly(){
        System.out.println("is flying");
    }
}

public class abstractClass {
    public static void main(String[] args){
        dogClass d = new dogClass("Labrador");
        d.eat();
        d.sound();

        birdy b = new birdy("Nemo");
        b.fly();
        b.eat();
        b.sound();
    }
}
