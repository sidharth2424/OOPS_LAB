import java.sql.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Q5 {
    public static void main(String[] args){
        List<String> arr=Arrays.asList("shaheem","sidharth","abhay");
        List<Integer> nums=arr.stream().map(String::length).collect(Collectors.toList());

        System.out.println(nums);
    }
}
