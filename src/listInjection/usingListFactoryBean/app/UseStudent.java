package listInjection.usingListFactoryBean.app;

import listInjection.usingListFactoryBean.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/listInjection/usingListFactoryBean/resources/applicationContext.xml");
        Student student = context.getBean("std1",Student.class);
        System.out.println(student);
    }
}
