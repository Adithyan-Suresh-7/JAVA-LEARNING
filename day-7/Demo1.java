import java.util.*;
class Demo1 {

    public static void main(String[] args) {
        
        ArrayList <Integer> score = new ArrayList<>();

        score.add(10);
        score.add(20);
        score.add(40);
        score.add(50);

        System.out.println(score);
        System.out.println(score.size());
        System.out.println(score.get(0));

        score.add(2, 30);

        System.out.println(score);

        score.set(0, 5);

        System.out.println(score);

        score.remove(3);

        System.out.println(score);

        score.add(3,50);

        System.out.println(score);

        System.out.println(score.size());








    }
}