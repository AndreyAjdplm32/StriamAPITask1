import java.util.*;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        intList.stream().filter(x -> x > 0).filter(x -> x % 2 == 0).sorted(Comparator.naturalOrder()).forEach(System.out::print);

        System.out.println();

        Collections.sort(intList);
        for (int i : intList) {
            if (i > 0) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }

    }
}