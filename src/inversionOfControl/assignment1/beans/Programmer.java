package inversionOfControl.assignment1.beans;

public class Programmer {
    private String name;
    private Computer comp;

    public Programmer() {
        System.out.println("Programmer bean created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("programmer name initialized");
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
        System.out.println("programmer computer initialized");
    }
}
