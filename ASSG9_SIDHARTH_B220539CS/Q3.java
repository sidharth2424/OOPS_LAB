import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        List<String> arr=Arrays.asList("sidharth","abhay","shaheem");

        List<String> uppernames=new ArrayList<>();

        for(String ss:arr){
            uppernames.add(ss.toUpperCase());
        }

        uppernames.forEach(name->System.out.println(name));
    }
}
