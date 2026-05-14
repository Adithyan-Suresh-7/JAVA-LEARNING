
import java.util.Scanner;

class Demo_2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Name :");
        String name = scan.nextLine();
        System.out.print("Enter your Score :");
        double score = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter your Department :");
        String dep = scan.nextLine();

        System.out.println("My name is " + name);
        System.out.println("My score is " + score / 10 + "/10");
        System.out.print("My department is " + dep);

    }

}