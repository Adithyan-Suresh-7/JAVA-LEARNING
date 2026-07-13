public class D3_garden {
    
    int apple_price = 20 ;
    int count = 5 ;

    void total_money (){
        System.out.println(apple_price * count);
    }
    public static void main(String[] args) {
        
        D3_garden obj = new D3_garden();

        obj.total_money();
    }
}
