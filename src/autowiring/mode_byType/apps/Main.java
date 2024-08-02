package autowiring.mode_byType.apps;

import autowiring.mode_byType.beans.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/autowiring/mode_byType/resources/applicationContext.xml");
        Customer c = context.getBean("cus1", Customer.class);
        System.out.println(c);
        System.out.println(c.getAccount().getBalance());
    }
}
