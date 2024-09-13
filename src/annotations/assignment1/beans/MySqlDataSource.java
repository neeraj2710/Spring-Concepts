package annotations.assignment1.beans;

public class MySqlDataSource implements DataSource{
    @Override
    public String[] getEmails(){
        String[] str = new String[5];
        str[0] = "mysqlemail1@gmail.com";
        str[1] = "mysqlemail2@gmail.com";
        str[2] = "mysqlemail3@gmail.com";
        str[3] = "mysqlemail4@gmail.com";
        str[4] = "mysqlemail5@gmail.com";
        return str;
    }
}
