public class Demo4 {
    public static void main(String[] args) {
        int total_units = 250;
        int bill = 0;

        if (total_units < 100) {
            bill = 0;
        }

        else if (total_units <= 200) {
            bill = (total_units - 100) * 2;
        }

        else if (total_units <= 300) {
            bill = (100 * 2) + (total_units - 200) * 3;
        } 
        
        else {
            bill = (100 * 2) + (100 * 3) + (total_units - 100) * 5;
        }

        System.out.println("the bill is "+bill);

    }
}
