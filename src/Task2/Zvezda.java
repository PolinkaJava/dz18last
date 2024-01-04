package Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zvezda {
    public static void main(String[] args) {

        Map<Integer, String> data = new HashMap<>();
        data.put(1, "John");
        data.put(2, "Alice");
        data.put(3, "Bob");
        data.put(4, "Charlie");
        data.put(5, "David");
        data.put(6, "Eve");
        data.put(7, "Frank");
        data.put(8, "George");
        data.put(9, "Hannah");
        data.put(10, "Isabella");
        data.put(11, "Jack");
        data.put(12, "Kate");
        data.put(13, "Liam");


        List<String> filteredNames = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : data.entrySet()) {
            int id = entry.getKey();
            if (id == 1 || id == 2 || id == 5 || id == 8 || id == 9 || id == 13) {
                String name = entry.getValue();
                if (name.length() % 2 != 0) {
                    filteredNames.add(reverseString(name));
                }
            }
        }


        for (String name : filteredNames) {
            System.out.println(name);
        }
    }


    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
