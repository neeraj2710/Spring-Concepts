package innerBean.correctEx.app;

import innerBean.correctEx.beans.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseAccount {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/innerBean/correctEx/resources/applicationContext.xml");

        Customer cus1 = context.getBean("cus1",Customer.class);
        Customer cus2 = context.getBean("cus2",Customer.class);

        System.out.println("customer 1");
        System.out.println("===================================");
        System.out.println("Name : "+cus1.getName());
        System.out.println("Account : "+cus1.getAccount());
        System.out.println();
        System.out.println("customer 2");
        System.out.println("===================================");
        System.out.println("Name : "+cus2.getName());
        System.out.println("Account : "+cus2.getAccount());
    }
}
