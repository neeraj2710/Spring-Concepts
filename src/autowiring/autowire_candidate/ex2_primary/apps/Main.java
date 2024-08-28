package autowiring.autowire_candidate.ex2_primary.apps;


import autowiring.autowire_candidate.ex2_primary.beans.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/autowiring/autowire_candidate/ex2_primary/resources/applicationContext.xml");
        Customer c = (Customer) context.getBean("cus1");
        System.out.println(c);


        System.out.println(c.getAccount().getBalance());
    }
}
