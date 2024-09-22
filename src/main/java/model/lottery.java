package model;
// import apple.laf.JRSUIUtils;

import java.util.LinkedList;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class lottery {
    public static void main(String[] args) {
        int n = 0;
        int group = Integer.parseInt(args[0]);
        String excludeString = args[1];
        String[] excludes = excludeString.split(" ");
        LinkedList<Integer> excludeNumbers = new LinkedList<>();
        for (String exclude : excludes) {
            excludeNumbers.add(Integer.parseInt(exclude));
        }

        Set<Integer> numbers = new TreeSet<>();
        int random;
        for (int i = 0; i < group; i++) {
            while (numbers.size() != 6) {
                random = (int) Math.ceil(Math.random() * 49);
                if (!excludeNumbers.contains(random)) {
                    numbers.add(random);
                }
            }
            System.out.println(numbers);
            numbers.clear();
        }
    }

}

