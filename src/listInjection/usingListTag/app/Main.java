package listInjection.usingListTag.app;

import listInjection.usingListTag.beans.Company;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/listInjection/usingListTag/resources/applicationContext.xml");
        Company comp = context.getBean("comp", Company.class);
        System.out.println(comp);
    }
}
