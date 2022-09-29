import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {

        //create a set

        Set<Student> mySet = new HashSet<>();

        // add element
        mySet.add(new Student("Bodo", 5));
        mySet.add(new Student("Brooke", 6));
        mySet.add(new Student("Bill", 7));
        mySet.add(new Student("Brian", 8));

        System.out.println(mySet);

        Set<Integer> numSEt = new HashSet<>();

        numSEt.add(1);
        numSEt.add(2);

        System.out.println(numSEt);
        System.out.println(numSEt.add(2));

        /*
            Find the first repeating char in a string

            Example:

            String = "Java Developer"

            output= a
        */

        String word = "Java Developer";

        List<Character> charOfTheWord = new ArrayList<>();
        Set<Character> setChar = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            if (setChar.contains(word.charAt(i)) == false) {
                setChar.add(word.charAt(i));
            } else {
                if (!charOfTheWord.contains(word.charAt(i))) {
                    charOfTheWord.add(word.charAt(i));
                }
            }
        }
        System.out.println(charOfTheWord );
        }



    }

