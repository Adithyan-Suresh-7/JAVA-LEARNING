import java.util.*;
public class D3_Addition {
 
    void add(){
        int a = 10 ;
        int b = 20 ;
        int c = a +b ;

        System.out.println(c);

    }

    void add(int a , int b){
        int c = a + b ;
        System.out.println( c );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        D3_Addition obj = new D3_Addition();

        obj.add(a, b);
        // obj.add();
    }
}
