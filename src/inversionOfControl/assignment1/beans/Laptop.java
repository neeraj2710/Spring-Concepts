package inversionOfControl.assignment1.beans;

public class Laptop implements Computer{
    private String brand;

    @Override
    public void run() {
        System.out.println("Laptop is running");
    }

    public Laptop() {
        System.out.println("Laptop bean created");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
        System.out.println("Laptop Brand initialized");
    }
}
