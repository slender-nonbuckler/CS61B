import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {

        int x = 0;
        for (int i: L){
            x+=i;
            }
        return x;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> evenno = new ArrayList<>();
        for (int i: L){
            if(i%2==0){
                evenno.add(i);
        }
    }
        return evenno;}

/** Returns a list containing the common item of the two given lists */
        public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
            List<Integer> common = new ArrayList<>();
            for (int i: L1) {
                for (int j : L2) {
                    if (j == i) {
                        common.add(i);
                    }
                }
            }
            return common;}


        /** Returns the number of occurrences of the given character in a list of strings. */
        public static int countOccurrencesOfC(List<String> words, char c) {
            int k=0;
            for (String i: words) {
                for (int n = 0; n < i.length(); n++) {

                    if (i.charAt(n) == c) {
                        k += 1;
                    }
                }
            }
            return k;
            }



}
