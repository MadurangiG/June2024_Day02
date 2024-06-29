package lambda;

public class LambdaWithRunnable {
    public static void main(String[] args) {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am anonymous runnable.");
            }
        };

        Runnable runnable2 = () -> System.out.println("I am runnable 2.");

        runnable1.run();
        runnable2.run();
    }
}
