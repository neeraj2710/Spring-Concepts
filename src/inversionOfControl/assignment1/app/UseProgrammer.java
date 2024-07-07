package inversionOfControl.assignment1.app;

import inversionOfControl.assignment1.beans.Programmer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseProgrammer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/inversionOfControl/assignment1/resources/applicationContext.xml");
        Programmer p1 = (Programmer) context.getBean("p1");
        Programmer p2 = (Programmer) context.getBean("p2");
        System.out.println();
        System.out.println();
        System.out.println("First Programmer");
        System.out.println("===========================");
        System.out.println(p1.getName());
        p1.getComp().run();
        System.out.println("Second Programmer");
        System.out.println("============================");
        System.out.println(p2.getName());
        p2.getComp().run();
    }
}
