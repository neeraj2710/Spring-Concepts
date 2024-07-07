package inversionOfControl.referenceInjection.app;

import inversionOfControl.referenceInjection.beans.Programmer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseProgrammer {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("/inversionOfControl/referenceInjection/resources/applicationContext.xml");
        Programmer p1 = container.getBean(Programmer.class);
        System.out.println("======================================");
        System.out.println(p1.getName());
        System.out.println(p1.getLp().getBrand());
    }
}
