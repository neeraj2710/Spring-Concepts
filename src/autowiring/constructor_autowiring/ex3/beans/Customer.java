package autowiring.constructor_autowiring.ex3.beans;




public class Customer {
    private String name;
    private Account account;

    public Customer(Account myacc) {
        System.out.println("constructor called");
        this.account = myacc;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}
