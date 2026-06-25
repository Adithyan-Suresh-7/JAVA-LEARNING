import java.util.*;

class Demo5 {
    static Scanner sc = new Scanner(System.in);

    public static String greet() {
        String greet = sc.nextLine  ();
        return greet;
    }

    public static void main(String[] args) {
        System.out.println("Before calling ");
        System.out.println(greet());
        System.out.println("After Calling ");
    }
}
