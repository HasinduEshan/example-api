import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat("Stella",2);

        System.out.println(cat.getName());

        Field[] declaredFields = cat.getClass().getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));

        for (Field field:declaredFields) {
            if (field.getName().equals("name")){
                field.setAccessible(true);
                field.set(cat,"kitty");
            }
        }

        System.out.println(cat.getName());

        Method[] declaredMethods = cat.getClass().getDeclaredMethods();
        for (Method method:declaredMethods) {
            if (method.getName().equals("sound")){
                method.setAccessible(true);
                method.invoke(cat);
                //Cat.eat();
            }
        }
    }
}