package lambda;

import java.util.function.Consumer;

public class LambdaWithConsumer {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = System.out::println;
        stringConsumer.accept("Hello World!");
    }
}
