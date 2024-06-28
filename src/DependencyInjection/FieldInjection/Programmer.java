package DependencyInjection.FieldInjection;

public class Programmer {
    private Computer comp;

    public void writeCode(){
        comp.start();
        System.out.println("writing code");
    }
}
