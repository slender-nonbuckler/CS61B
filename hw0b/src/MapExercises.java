import edu.princeton.cs.algs4.In;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExercises {
    /**
     * Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */


    public static Map<Character, Integer> letterToNum() {
        Map<Character, Integer> LetterToNum = new TreeMap<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int k = 1;
        for (int i = 0; i<alphabet.length();i++){
            char letter = alphabet.charAt(i);
            LetterToNum.put(letter, k);
            k++;
        }
        return LetterToNum;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        Map<Integer, Integer> squares = new TreeMap<>();
        for(int i:nums){
            int k = (int)Math.pow(i, 2);
            squares.put(i, k);
        }
        return squares;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> cw = new TreeMap<>();
        for (String word:words){
            if (cw.containsKey(word)) {
                cw.put(word, (cw.get(word) + 1));
            }else {
                cw.put(word, 1);
            }
            }
            return cw;
    }

    }
