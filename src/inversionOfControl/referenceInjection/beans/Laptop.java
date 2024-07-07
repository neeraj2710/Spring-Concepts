package inversionOfControl.referenceInjection.beans;

public class Laptop {
    private String brand;

    public Laptop() {
        System.out.println("laptop bean created");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
        System.out.println("laptop brand initialized");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
