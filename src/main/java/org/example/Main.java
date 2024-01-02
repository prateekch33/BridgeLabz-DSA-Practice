package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        List<String> result=AllPermutations.recursivePermutations(s);
        System.out.println("Recursively");
        for(String i:result) {
            System.out.println(i);
        }
        System.out.println("Iteratively");
        result=AllPermutations.allPermutationsIteratively(s);
        for(String i:result) {
            System.out.println(i);
        }
    }
}