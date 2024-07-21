package arrayInjection.usingValueTag.app;

import arrayInjection.usingValueTag.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class UseStudent {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/arrayInjection/usingValueTag/resources/applicationContext.xml");
        Student student = context.getBean("std1",Student.class);
        System.out.println("Student name : " + student.getName());
        System.out.println("Student roll no : "+student.getRoll());
        System.out.println("Student subjects : " + Arrays.toString(student.getSubjects()));
    }
}
