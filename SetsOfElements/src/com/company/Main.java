package com.company;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] sizeSets = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Set<String> firstSet = new LinkedHashSet<>();
        for (int firstSetSIze = 0; firstSetSIze < sizeSets[0]; firstSetSIze++) {
            firstSet.add(scan.nextLine());
        }

        Set<String> secondSet = new LinkedHashSet<>();
        for (int secondSetSize = 0 ; secondSetSize < sizeSets[1] ; secondSetSize++) {
            secondSet.add(scan.nextLine());
        }

        firstSet.retainAll(secondSet);
        for (String el : firstSet) {
            System.out.printf("%s ", el);
        }
    }
}
