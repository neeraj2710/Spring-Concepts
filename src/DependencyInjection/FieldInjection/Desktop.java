package DependencyInjection.FieldInjection;

public class Desktop implements Computer {

    @Override
    public void start() {
        System.out.println("Desktop Started");
    }
}
