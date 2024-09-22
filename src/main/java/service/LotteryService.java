package service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class LotteryService {
    public ArrayList[] getNumbers(int groups, LinkedList excludes) {
        Set<Integer> numbers = new TreeSet<>();
        ArrayList<Integer>[] lists = new ArrayList[groups];
        int random;
        for (int i = 0; i < groups; i++) {
            while (numbers.size() != 6) {
                random = (int) Math.ceil(Math.random() * 49);
                if (!excludes.contains(random)) {
                    numbers.add(random);
                }
            }
            lists[i] = new ArrayList<>(numbers);
            numbers.clear();
        }
        return lists;
    }
}
