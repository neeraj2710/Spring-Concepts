package inversionOfControl.Ex1.beans;

public class Student {
    private int rollno;
    private String name;

    public Student() {
        System.out.println("Student bean created");
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
        System.out.println("setter called for rollno");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setter called for name");
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}
