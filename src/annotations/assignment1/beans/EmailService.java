package annotations.assignment1.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailService {
    private DataSource ds;


    public EmailService(DataSource ds){
        this.ds = ds;
    }

    public void sendEmail(){
        String[] emails = ds.getEmails();
        System.out.println("Data Source: "+ds.getClass());
        for(String email : emails){
            System.out.println(email+" : mail sent");
        }
    }
}
