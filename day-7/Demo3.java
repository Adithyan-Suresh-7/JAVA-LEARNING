
import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        System.out.println(fruits);
        System.out.println(fruits.size());
        fruits.remove("Banana");
        System.out.println(fruits);
        fruits.add("Pineapple");
        System.out.println(fruits);
        fruits.add("Apple"); 
        fruits.isEmpty();
        fruits.clear();
        System.out.println(fruits);
    }
}







 //Hashsets are a part of the Java Collections Framework and are used to store unique elements. They do not maintain any order of elements and provide constant-time performance for basic operations like add, remove, and contains.
 //create a hashset: HashSet<Type> set = new HashSet<>();
 //common operations: add, remove, contains, size, isEmpty, clear

 //key features of HashSet:
 // 1. Unique elements only
 // 2. No guaranteed order
 // 3. Constant-time performance for basic operations is 0(1)
 // 4. Allows null values
