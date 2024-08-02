package autowiring.mode_no.apps;

import autowiring.mode_no.beans.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/autowiring/mode_no/resources/applicationContext.xml");
        Customer c = context.getBean("cus1", Customer.class);
        System.out.println(c);

//        NullPointerException
        System.out.println(c.getAccount().getBalance());
    }
}
