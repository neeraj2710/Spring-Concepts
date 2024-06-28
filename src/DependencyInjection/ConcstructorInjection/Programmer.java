package DependencyInjection.ConcstructorInjection;

public class Programmer {
    private Computer comp;
    public Programmer(Computer comp) {
        this.comp = comp;
    }
    public void writeCode(){
        comp.start();
        System.out.println("writing code");
    }
}
