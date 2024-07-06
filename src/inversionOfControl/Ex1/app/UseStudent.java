package inversionOfControl.Ex1.app;

import inversionOfControl.Ex1.beans.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class UseStudent {
    public static void main(String[] args) {
        BeanFactory container = new XmlBeanFactory(new ClassPathResource("/inversionOfControl/Ex1/resources/beanConfig.xml"));
//        Student student = (Student) container.getBean("stObj");
        Student student = (Student) container.getBean(Student.class);
        System.out.println(student);
    }
}
