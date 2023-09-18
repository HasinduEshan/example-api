import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) throws Exception {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 21, 11, 34, 54, 67, 87, 45, 34);

        for (Integer integer:list) {
            System.out.print(integer+", ");
        }

        System.out.println();

        /*Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n%2==0;
            }
        };*/

        /*Predicate<Integer> predicate = (Integer n) ->{
                return n%2==0;
        };*/

//        Predicate<Integer> predicate = (Integer n) ->n%2==0;

        Predicate<Integer> predicate = n -> n%2==0;

        list.stream()
                .filter(predicate) //n -> n%2==0
                .map(n -> n*1.1)
                .sorted()
                .forEach(n-> System.out.printf("%.2f, ",n));

        /*System.out.println();
        list.stream().forEach(n-> System.out.print((n*2)+", "));*/
    }
}