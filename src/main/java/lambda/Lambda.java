package lambda;

import java.util.*;

public class Lambda {
    public static void main(String[] args) {
        //create a list of String array and print the reverse
        List<String> fruitNames = Arrays.asList("Apple","Banana","Mango","Orange");
        System.out.println("Original List: "+ fruitNames);
        Collections.reverse(fruitNames); //Using the Lambda functions
        System.out.println("Reversed List: "+fruitNames);

        List<String> reverseList = new ArrayList<>();
        for(int i =fruitNames.size()-1; i>=0; i--){
            reverseList.add(fruitNames.get(i));

        }

        //Example 02: Filter a List of Integers(Even numbers in the List)

        List<Integer> eveNumberList = new ArrayList<>();
        List<Integer> eveNumberList2 = new ArrayList<>();
        List<Integer> eveNumberList3 = new ArrayList<>();
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        for(int a=0; a<numberList.size();a++){
//            if(numberList.get(a)%2==1){
//                eveNumberList.add(a);
//            }
//        }
//        System.out.println(eveNumberList);

        //Using enhanced for loop
        for(int element: numberList){
            if(element%2==0){
                eveNumberList.add(element);
            }
        }
        System.out.println("Using enhanced for loop: "+eveNumberList);

        //using for each loop
        numberList.forEach(Integer ->{
            if(Integer%2==0) eveNumberList2.add(Integer);
        });

        System.out.println("For Each:"+eveNumberList2);

        //Using a stream API
        numberList.stream().filter(integer ->integer%2==0).toList();
        System.out.println("Using Stream method: "+eveNumberList);

//        Example 03 : Transform a List of Strings to Uppercase

        List<String> stringList = Arrays.asList("One","two","home","bird");
        stringList.replaceAll(Str -> Str.toUpperCase());
        System.out.println(stringList);

        List<String> upperCaseList = new ArrayList<>();
        upperCaseList = stringList.stream().map(s -> s.toUpperCase()).toList();
        System.out.println(upperCaseList);

//        With method reference
        upperCaseList = stringList.stream().map(String::toUpperCase).toList();
        System.out.println(upperCaseList);


    }
}
