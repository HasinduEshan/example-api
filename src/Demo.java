import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat("Stella",2);

        if (cat.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("This is very Important Class");
        }else{
            System.out.println("This not very Important");
        }

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
            if (method.isAnnotationPresent(PrintCount.class)){
                method.setAccessible(true);
                for (int i = 0; i < method.getAnnotation(PrintCount.class).times(); i++) {
                    method.invoke(cat);
                }
                //Cat.eat();
            }
        }
    }
}