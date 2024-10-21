import java.util.*;
import java.util.stream.Collectors;

public class Q4{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("sidharth", "abhay", "shaheem");

        List<String> uppernames = names.stream()
                                        .map(String::toUpperCase)
                                        .collect(Collectors.toList());

        uppernames.forEach(System.out::println);
    }
}
