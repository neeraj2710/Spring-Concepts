package annotations.assignment1.beans;

public class FileDataSource implements DataSource {

    @Override
    public String[] getEmails(){
        String[] str = new String[4];
        str[0] = "fileemail1@gmail.com";
        str[1] = "fileemail2@gmail.com";
        str[2] = "fileemail3@gmail.com";
        str[3] = "fileemail4@gmail.com";
        return str;
    }
}
