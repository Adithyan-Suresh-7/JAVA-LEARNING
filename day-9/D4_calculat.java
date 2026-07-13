public class D4_calculat {
    
    void add(int a , int b){
        System.out.println(a + b ); 
    }
    void mul(int a , int b){
        System.out.println(a * b ); 
    }
    void div(int a , int b){
        System.out.println(a / b ); 
    }
    void sub(int a , int b){
        System.out.println(a - b ); 
    }

    public static void main(String[] args) {
        D4_calculat obj = new D4_calculat();

        obj.add(10, 20);
        obj.div(50,5 );
        obj.mul(100, 10);
        obj.sub(99, 10);
    }

}
