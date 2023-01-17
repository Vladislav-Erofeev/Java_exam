package task5;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alyssa", 22);
        map.put("Ayssa", 25);
        map.put("Alysa", 25);
        map.put("Alyssa", 20);
        map.put("Al", 20);
        map.put("Ki", 22);
        map.put("Km", 25);
        System.out.println(rarest(map));
    }

    public static int rarest(Map<String, Integer> map) {
        Map<Integer, Integer> counter = new HashMap<>();
        for(Map.Entry<String, Integer> item : map.entrySet()) {
            if(counter.containsKey(item.getValue()))
                counter.put(item.getValue(), counter.get(item.getValue()) + 1);
            else
                counter.put(item.getValue(), 1);
        }
        int minValue = 1000;
        int minNumber = 1000;
        for(Map.Entry<Integer, Integer> item : counter.entrySet()) {
            if(item.getValue() < minValue) {
                minValue = item.getValue();
                minNumber = item.getKey();
            } else if(item.getValue() == minValue && item.getKey() < minNumber) {
                minNumber = item.getKey();
            }
        }
        return minNumber;
    }
}
