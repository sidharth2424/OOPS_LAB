import java.util.*;

public class Q13 {
    public static void main(String[] args) {
        List<Integer> arr=Arrays.asList(1,2,3,4,5,6);

        int res=arr.stream().reduce(1,(a,b)->a*b);
        System.out.println("the product is: "+res);
    }
}
