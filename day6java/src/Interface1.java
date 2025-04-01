interface A{
    default void print(){
        System.out.println("A is default");
    }
}
interface B extends A{}
interface C extends A{}

class defaultDemo implements B,C{
    @Override
    public void print(){
        System.out.println("Explicitly call main interface methods");
        C.super.print();
    }
}

public class Interface1 {
    public static void main(String[] args){
        defaultDemo d =new defaultDemo();
        d.print();
    }
}
