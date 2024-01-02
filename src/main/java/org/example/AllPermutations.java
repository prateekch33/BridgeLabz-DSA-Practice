package org.example;

import java.util.ArrayList;
import java.util.List;

public class AllPermutations {
    static List<String> allPermutationsIteratively(String s) {
        List<String> result = new ArrayList<>();
        result.add(String.valueOf(s.charAt(0)));

        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            List<String> newPermutations = new ArrayList<>();

            for (String permutation : result) {
                for (int j = 0; j <= permutation.length(); j++) {
                    newPermutations.add(permutation.substring(0, j) + currentChar + permutation.substring(j));
                }
            }
            result = newPermutations;
        }
        return result;
    }
    public static List<String> recursivePermutations(String str) {
        List<String> result = new ArrayList<>();

        if (str.length() == 1) {
            result.add(str);
        } else {
            char firstChar = str.charAt(0);
            String remaining = str.substring(1);
            List<String> permutations = recursivePermutations(remaining);

            for (String permutation : permutations) {
                for (int i = 0; i <= permutation.length(); i++) {
                    result.add(permutation.substring(0, i) + firstChar + permutation.substring(i));
                }
            }
        }

        return result;
    }

}
