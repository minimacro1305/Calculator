package at.fhj.iit;

public class GreeterImpl implements Greeter{
    private String name;

    GreeterImpl(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return this.name;
    }

    public void sayHello(){

    }

    public void sayGoodbye(){
        System.out.println("Good Bye, " + this.getName() + "!");
    }




}
