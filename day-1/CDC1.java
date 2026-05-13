import java.util.Scanner;

class CDC1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Mark : ");

        int mark = scan.nextInt();

        if (mark > 34) {
            System.out.print("pass");
        } else {
            System.out.print("fail");
        }
    }
}
