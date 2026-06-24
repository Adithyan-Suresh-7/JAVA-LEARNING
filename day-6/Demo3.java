import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter the Array Size : ");
        int n = sc.nextInt();

        int[] arr = new int[n + 1];
        System.err.println("Enter "+n+" Element");
        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();

        }
        System.out.print("Enter position (index): ");
        int position = sc.nextInt();
        System.out.print("Enter value to insert: ");
        int value = sc.nextInt();

        for(int i = n ; i > position ; i--){
            arr[i] = arr[i-1];

        }
        arr[position] = value;
        System.out.println("Array After insertion ");
        for(int i = 0 ; i <= n ; i++ ){
            System.out.println(arr[i] + " ");
        }


    }
}
