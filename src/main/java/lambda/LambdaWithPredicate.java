package lambda;

import java.util.function.Predicate;

public class LambdaWithPredicate {
    public static void main(String[] args) {
        Predicate<String> stringLengthGreaterFive = s-> s.length()>5;
        System.out.println(stringLengthGreaterFive.test("Elephant"));
        System.out.println(stringLengthGreaterFive.test("Hi"));
    }
}
