package inversionOfControl.assignment1.beans;

public class Desktop implements Computer{
    private String brand;

    @Override
    public void run() {
        System.out.println("Desktop is running");
    }

    public Desktop() {
        System.out.println("Desktop bean created");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
        System.out.println("Desktop brand initialized");
    }
}
