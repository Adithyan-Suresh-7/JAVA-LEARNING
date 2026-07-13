public class D1_function {
    void greet (){
        System.out.print("HELLO  ");
        greet2();
    }
    void greet2(){
        System.out.print("WORLD");
    }

    public static void main(String[] args) {
        
        D1_function obj = new D1_function();

        obj.greet();
    }
}
