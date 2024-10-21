import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Q8 {
    public static void main(String[] args) {
        List<String> arr=Arrays.asList("sidharth","Abi","Abhay","shaheem");
        Predicate<String> Astarting=name->name.startsWith("A");
        List<String> res=arr.stream().filter(Astarting).collect(Collectors.toList());

        System.out.println(res);
    }
}
