import java.util.*;
import java.util.stream.Collectors;

public class Q6 {
    public static void main(String[] args) {
        List<String> arr=Arrays.asList("shaheem","abinandh","abahy","suku");
        arr.stream().filter(name->name.startsWith("A")).forEach(System.out::println);;
    }
}
