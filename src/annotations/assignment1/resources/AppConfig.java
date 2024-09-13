package annotations.assignment1.resources;

import annotations.assignment1.beans.EmailService;
import annotations.assignment1.beans.FileDataSource;
import annotations.assignment1.beans.MySqlDataSource;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@Configurable
@ComponentScan(basePackages = "annotations.assignment1.beans")
public class AppConfig {
    @Bean
    public FileDataSource fileDataSource() {
        return new FileDataSource();
    }

    @Bean
    @Primary
    public MySqlDataSource mySqlDataSource() {
        return new MySqlDataSource();
    }

//    @Bean
//    public EmailService emailService() {
//        return new EmailService(fileDataSource());
//    }
}
