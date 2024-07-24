package listInjection.usingNewSchema.app;

import listInjection.usingNewSchema.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseStudent {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/listInjection/usingNewSchema/resources/applicationContext.xml");
        Student student = context.getBean("std1",Student.class);
        System.out.println(student);
        System.out.println(student.getSubjects().getClass());
    }
}
