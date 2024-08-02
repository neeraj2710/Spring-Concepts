package autowiring.mode_byName.beans;

import autowiring.mode_byName.beans.Account;

public class Customer {
    private String name;
    private autowiring.mode_byName.beans.Account account;

    public Customer() {
    }

    public autowiring.mode_byName.beans.Account getAccount() {
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
