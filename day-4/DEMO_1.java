import java.util.Scanner;
 class DEMO_1{
    public static void main(String args[])
     {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter win /  loss :");

        String rcb = scan.nextLine();

        if( rcb.equals("win"))
        {
            System.out.print("Ee sala cup namdhey");   
        }

        else if (rcb.equals("loss"))
        {
            System.out.print("CUP illey");
        }

        else{
            System.out.print("ERROR CHOOSE win / loss");
        }

     }
    
    }