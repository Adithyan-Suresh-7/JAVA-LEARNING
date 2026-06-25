import java.util.*;
public class Demo2 {
    public static void main(String[] args) {
        ArrayList <String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("watermelon");

        System.out.println(fruits);

        fruits.add("papaya");

        System.out.println(fruits);

        fruits.set(0, "banana");
        System.out.println(fruits);

        System.out.println(fruits.size() );

        fruits.remove(2);

        System.out.println(fruits);

        fruits.clear();

        System.out.println(fruits);

        System.out.println(fruits.size());


        
    }
}
