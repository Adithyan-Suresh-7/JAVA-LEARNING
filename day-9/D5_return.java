public class D5_return {
    
    int pen(int a ){
        int pen_price = 20 ;
        int balance =a - pen_price;
        return balance ;  
    }


    public static void main(String[] args) {
        
        D5_return obj = new D5_return();

        int balance = obj.pen(50);
        System.out.println( balance );
    }
}
