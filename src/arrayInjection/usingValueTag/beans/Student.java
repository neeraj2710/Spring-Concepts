package arrayInjection.usingValueTag.beans;

import java.util.Arrays;

public class Student {
    private int roll;
    private String name;
    private String[] subjects;

    public Student() {
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}
