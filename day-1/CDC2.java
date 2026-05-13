import java.util.Scanner;
 class CDC2 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the income :");
        int a = scan.nextInt();

        if (a>6999){
            System.out.print("Scholarship is available");
        }
        else{
            System.out.print("Not eligilble for scholarship");
        }
    }
}    
