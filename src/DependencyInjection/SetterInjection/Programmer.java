package DependencyInjection.SetterInjection;

public class Programmer {
    private Computer comp;

    public void setComp(Computer comp) {this.comp = comp;}
    public void writeCode(){
        comp.start();
        System.out.println("writing code");
    }
}
