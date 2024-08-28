package autowiring.default_autowire_candidate.ex1.apps;



import autowiring.default_autowire_candidate.ex1.beans.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/autowiring/default_autowire_candidate/ex1/resources/applicationContext.xml");
        Customer c = (Customer) context.getBean("cus1");
        System.out.println(c);


        System.out.println(c.getAccount().getBalance());
    }
}
