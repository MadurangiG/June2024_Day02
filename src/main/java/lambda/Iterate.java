package lambda;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Iterate {
    public static void main(String[] args) {
        List<String> newStringList = Arrays.asList("First","Second","Third","Fourth");

        newStringList.stream().forEach(i->{
            System.out.println(i+" ");
        });


//        Using method reference
        newStringList.forEach(System.out::println);
    }
}
