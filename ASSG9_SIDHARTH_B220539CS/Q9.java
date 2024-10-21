import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        List<String> arr=Arrays.asList("sidharth","Abi","Abhay","shaheem");

        int sum=arr.stream().mapToInt(String::length).sum();
        System.out.println("total sum is: "+sum);
    }
}
