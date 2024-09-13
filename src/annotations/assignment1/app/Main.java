package annotations.assignment1.app;

import annotations.assignment1.beans.EmailService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(annotations.assignment1.resources.AppConfig.class);
        EmailService emailService = (EmailService) context.getBean("emailService");
        emailService.sendEmail();
    }
}
