package inversionOfControl.referenceInjection.beans;

public class Programmer {
    private String name;
    private Laptop lp;

    public Programmer() {
        System.out.println("Programmer bean created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Programmer name initialized");
    }

    public Laptop getLp() {
        return lp;
    }

    public void setLp(Laptop lp) {
        this.lp = lp;
        System.out.println("Programmer laptop initialized");
    }
}
