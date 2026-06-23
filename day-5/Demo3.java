import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Mark : ");

        int mark = scan.nextInt();

        if (mark >= 90){
            System.out.println("Grade = A+ ");
        }
        if (mark >= 80 && mark < 90) {
            System.out.println("Grade = B+ ");
        }
        if (mark >= 70 && mark < 80) {
            System.out.println("Grade = C+ ");
        }
        if (mark >= 60 && mark < 70) {
            System.out.println("Grade = c ");
        } else {
            System.out.println("Grade = D");
        }

    }
}
