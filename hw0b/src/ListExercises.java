import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        int sum = 0;
        for (int i = 0; i < L.size(); ++i)
            sum += L.get(i);
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < L.size(); ++i) {
            int element = L.get(i);
            if(element % 2 == 0) list.add(element);
        }
        return list;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> list = new ArrayList<>();
        outer: for (int i = 0; i < L1.size(); ++i)
            for (int j = 0; j < L2.size(); ++j)
                if (L1.get(i).equals(L2.get(j))) {
                    list.add(L1.get(i));
                    continue outer;
                }
        return list;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int occur = 0;
        for (int i = 0; i < words.size(); ++i) {
            char[] ca = words.get(i).toCharArray();
            for (int j = 0; j < ca.length; ++j) if (c == ca[j]) ++occur;
        }
        return occur;
    }
}
