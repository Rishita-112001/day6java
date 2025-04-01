interface walk{
    public void walking();
}
interface run{
    public void running();
}
class human implements walk, run{
    String name;
    human(String name){
        this.name = name;
    }
    public void walking(){
        System.out.println(name +" is walking");
    }
    public void running(){
        System.out.println(name +" is running");
    }
}

public class Interface {
    public static void main(String[] args){
        human h = new human("C-DAC");
        h.walking();
        h.running();
    }
}
