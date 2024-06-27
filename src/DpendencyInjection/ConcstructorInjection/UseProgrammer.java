package DpendencyInjection.ConcstructorInjection;

public class UseProgrammer {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Desktop desktop = new Desktop();
        Programmer p1 = new Programmer(l1);
        Programmer p2 = new Programmer(desktop);
        p1.writeCode();
        p2.writeCode();
    }
}
