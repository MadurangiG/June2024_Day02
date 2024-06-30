package lambda;

import java.util.Random;
import java.util.function.Function;

public class RandomNumberGeneration {
    public static void main(String[] args) {
//        Method 1
//        System.out.println(ranGen(10,20));
//        Method 2
//        System.out.println(genRand(5,10));

//        Tried myself
//        Random random = new Random();
//        for(int i=0; i<10;i++){
//            int randomNumber = random.nextInt(100);
//            System.out.println("Random number "+(i+1)+": "+randomNumber);
//        }
//        Using Functional Interface Method 3 (Keep in mind)
        Function<Integer[],Integer> randomNumGenereation = integers -> {
            int min = integers[0];
            int max = integers[1];
            return new Random().nextInt(((max-min)+1))+min;
        };

        System.out.println(randomNumGenereation.apply(new Integer[]{2,10}));
    }

    public static int ranGen(int min, int max){
        return (int)(Math.random()*(max-min+1)+min);
    }

    public static int genRand(int min, int max){
        return new Random().nextInt(((max-min)+1))+min;
    }
}
