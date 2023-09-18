import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) throws Exception {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 21, 11, 34, 54, 67, 87, 45, 34);

        for (Integer integer:list) {
            System.out.print(integer+", ");
        }

        System.out.println();
        Stream<Integer> stream = list.stream();

        Stream<Double> mappedStream = stream.map(n -> n*1.1);

        System.out.println();
        mappedStream.forEach(n-> System.out.printf("%.2f, ",n));

        /*System.out.println();
        list.stream().forEach(n-> System.out.print((n*2)+", "));*/
    }
}