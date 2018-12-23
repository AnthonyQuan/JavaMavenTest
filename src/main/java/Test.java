import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Anthony on 9/12/2017.
 */
public class Test {


    public static void main(String[] args){
        System.out.println("Main class is running");



        //listFunctions();
        //arrayFunctions();
        //operators();
        //convertListToArray();
    }

    private static void operators() {

        //System.out.println(5%2==1);
        for (int i=4; i<=7; i++){
            //System.out.println(i);
            if (i%2==1)
            {
                System.out.println(i +" is odd");
            }
        }
    }

    private static void convertListToArray() {
        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(4);
        intList.add(3);
        intList.add(2);
        intList.add(1);

        System.out.println("Print each in a list");
        for(int i:intList)
        {
            System.out.println(i);
        }

        System.out.println("Now Convert to array and print");
        int[] intArr = new int[intList.size()];
        int index=0;
        for(int i:intList) {
            intArr[index] = i;
            index++;
        }

        for(int i:intArr)
        {
            System.out.println(i);
        }

    }

    private static void arrayFunctions() {
        int[] numbers = {1,5,3,2,7,3,6};
        //sort array
        //Arrays.sort(numbers);

        Arrays.sort(numbers,3,numbers.length);

        //split array
        int[] secondHalf = Arrays.copyOfRange(numbers,4,numbers.length-2);
        System.out.println(Arrays.toString(numbers));


    }

    private static void listFunctions() {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(5);
        intList.add(3);
        intList.add(8);
        intList.add(6);

        //intList.sort((a,b) -> Integer.compare(a,b));

        Collections.sort(intList);
        System.out.println(intList);

        System.out.println("Now split the list");

        List firstHalf = intList.subList(0,3);
        System.out.println(firstHalf);
        List secondHalf = intList.subList(3,5);
        System.out.println(secondHalf);


        if (intList.contains(3))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("No");
        }

    }


}
