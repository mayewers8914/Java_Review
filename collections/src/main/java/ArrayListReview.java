import java.util.ArrayList;
import java.util.List;

public class ArrayListReview {

    public static void main(String[] args) {

        /*
            Instructions:

                Create an ArrayList
                Add Elements
                Iterate on ArrayList using the ff:
                    - For Loop with get(index)
                    - Iterator

                    *Forward Iteration
                    *Backward Iteration

                For Each loop
                Lambda

                Sorting Element in List

        */

        List<String> arrayTest = new ArrayList();

        arrayTest.add("May");
        arrayTest.add("John");
        arrayTest.add("Phoebe");
        arrayTest.add("Zoe");

        System.out.println(arrayTest.size());
        System.out.println(arrayTest.get(3));
        System.out.println(arrayTest.contains("Zoe"));
        System.out.println(arrayTest.indexOf(2));

        for (int i = 0; i < arrayTest.size(); i++) {
            System.out.println(arrayTest.get(i));
        }

        for (String name : arrayTest) {
            System.out.println(name);
        }

        arrayTest.forEach(
                (name)-> System.out.println(name)
        );

        System.out.println("Printing backwards");

        for (int i = arrayTest.size() - 1; i >=0; i--) {
            System.out.println(arrayTest.get(i));
        }


    }

}
