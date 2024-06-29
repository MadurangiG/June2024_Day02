package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaWithComparator {
    public static void main(String[] args) {
        String[] stringArray = {"Dog","Cat","Banana","Elephant","Apple","Hi"};
        Arrays.sort(stringArray, (String::compareTo));
        System.out.println(Arrays.toString(stringArray));

//        Using original way
        Arrays.sort(stringArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });

        System.out.println(Arrays.toString(stringArray));

//Using lambda functions
        Arrays.sort(stringArray,(o1,o2)-> {
            return o1.length()-o2.length();
        });
        System.out.println(Arrays.toString(stringArray));

    }
}
