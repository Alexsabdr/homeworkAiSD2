package cw2703;



import java.util.*;

public class homework2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("яблоко", "Апельсин", "банан");
        words.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(words);
    }
}
