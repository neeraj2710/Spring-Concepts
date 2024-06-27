package DpendencyInjection.SetterInjection;

public class UseProgrammer {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Desktop desktop = new Desktop();
        Programmer p1 = new Programmer();
        Programmer p2 = new Programmer();
        p1.setComp(l1);
        p2.setComp(desktop);
        p1.writeCode();
        p2.writeCode();
    }
}
