package DpendencyInjection.ConcstructorInjection;

public class Laptop implements Computer{

    @Override
    public void start() {
        System.out.println("Laptop Started");
    }
}
