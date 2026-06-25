import java.util.HashMap;
import java.util.Map;

public class demo4 {
  
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 2);
        map.put("orange", 5);

        System.out.println("HashMap contents:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        System.out.println("Value for banana: " + map.get("banana"));
        System.out.println("Contains apple? " + map.containsKey("apple"));
        System.out.println("Size: " + map.size());
    }
}
