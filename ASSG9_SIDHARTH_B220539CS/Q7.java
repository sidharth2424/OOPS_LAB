import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Q7{
    public static void main(String[] args) {
        List<String> arr=Arrays.asList("shaheem","Abinandh","abahy","suku");
        List<String> res=arr.stream().filter(name->name.startsWith("A")).collect(Collectors.toList());
        System.out.println(res);
    }
}
