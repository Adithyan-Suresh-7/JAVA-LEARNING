import java.util.Scanner;
public class Demo2 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int a = scan.nextInt();

        if (a < 0) {
            System.out.println("its a negative number");
        } else {
            System.out.println("its an positive Number ");
        }
    }
}
