package DependencyInjection.FieldInjection;

import java.lang.reflect.Field;

public class UseProgrammer {
    public static void main(String[] args)throws Exception {
        Class clz = Class.forName("DependencyInjection.FieldInjection.Programmer");
        Object obj = clz.newInstance();
        Programmer p1 = (Programmer) obj;

        Field compField = clz.getDeclaredField("comp");
        compField.setAccessible(true);
        compField.set(p1, new Laptop());

        p1.writeCode();
    }
}
