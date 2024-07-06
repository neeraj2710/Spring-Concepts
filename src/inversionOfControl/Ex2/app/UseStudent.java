package inversionOfControl.Ex2.app;

import inversionOfControl.Ex1.beans.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class UseStudent {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/inversionOfControl/Ex2/resources/applicationContext.xml");
//        Student student = (Student) context.getBean("stObj");
        Student student = (Student) context.getBean(Student.class);
        System.out.println(student);
    }
}
