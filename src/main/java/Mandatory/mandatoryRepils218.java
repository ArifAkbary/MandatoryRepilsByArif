package Mandatory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mandatoryRepils218 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("switch");
        list.add("tv");
        list.add("switch");
        list.add("tv");
        list.add("switch");
        list.add("tv");
        System.out.println(countDeviceNames(list));
    }

    public static List<String> countDeviceNames(ArrayList<String> list) {

        Map<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        for (String s : list) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String m : map.keySet()) {
            // m = swtich
            int count = map.get(m);
            int size = count - 1;
            for (int i = 0; i < count; i++) {

                if (size > 0) {
                    res.add(m + String.valueOf(size));
                } else if (size == 0) {
                    res.add(m);
                }
                size--;
            }
        }
        return res;
    }
}



