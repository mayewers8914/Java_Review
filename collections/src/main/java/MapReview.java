import java.util.HashMap;
import java.util.Map;

public class MapReview {

    public static void main(String[] args) {
        Map< Integer , String > map = new HashMap<>();
        map.put(1, "May");
        map.put(2, "John");
        map.put(3, "Phoebe");
        map.put(4, "Zoe");
        System.out.println(map.get(3));

        System.out.println("Developer testing maps");

        System.out.println(findFirstNonRepeat("Java Develeper"));

    }

    public static Character findFirstNonRepeat(String word) {

        Map<Character, Integer> mapChar = new HashMap<>();

        //counting the characters
        int count;

        //counting and looping through the characters
        //putting values in a hashmap
        for (Character ch : word.toCharArray()) {
            if (mapChar.containsKey(ch)) {
                count = mapChar.get(ch);
                mapChar.put(ch, count + 1);
            } else {
                mapChar.put(ch, 1);
            }
        }

        //starting from string, check if the char count equals q
        for (Character ch : word.toCharArray()) {
            if(mapChar.get(ch) == 1)
                return ch;
        }
        return Character.MIN_VALUE;
    }


}
