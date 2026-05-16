import java.util.Scanner;

class Demo_3 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String a1 = scan.nextLine();
        String a2 = scan.nextLine();

        if (a1.equals(a2)) {
            System.out.print("they  are  same ");
        } else {
            System.out.print("They are different");
        }

    }
}