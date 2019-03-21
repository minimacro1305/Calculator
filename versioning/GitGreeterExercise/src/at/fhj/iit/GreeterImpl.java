package at.fhj.iit;

public class GreeterImpl{
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
}
