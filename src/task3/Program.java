/*
 * 101
 * This program was made by Vladislav Erofeev. IKBO-01-21
 */

package task3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("mOQT36j8", "Test");
        map.put("bKTRGE", "Test1");
        map.put("57Q4", "Test3");
        map.put("0X787", "Test4");
        map.put("Wdqc9rc", "Test2");
        System.out.println(isUnique(map));
    }

    public static boolean isUnique(Map<String, String> map) {
        if(map == null || map.isEmpty()) return true;
        Set<String> strings = new HashSet<>(map.values());
        if(strings.size() == map.size())
            return true;
        return false;
    }
}
