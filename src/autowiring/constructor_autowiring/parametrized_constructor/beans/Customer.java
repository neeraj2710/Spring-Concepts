package autowiring.constructor_autowiring.parametrized_constructor.beans;



public class Customer {
    private String name;
    private int age;
    private Account account;
    private Address address;

    public Customer(String name, int age, Account account, Address address) {
        System.out.println("constructor called");
        this.account = account;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", account=" + account +
                ", address=" + address +
                '}';
    }
}
