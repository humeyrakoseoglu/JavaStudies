package LambdaCalculus;

import java.util.Arrays;
import java.util.List;

public class LambdaExpression {
    interface lambda{
        int run(int x);

    }
    interface lambda2{
        int run(int x, int y);
    }

    int gv = 100;
    public int f(int x){
        return x*x;
    }

    public static void main(String[] args) {
        System.out.print("Ornek 1 : ");
        lambda l = ((int x) -> (x * x)); // x -> x * x; şeklinde de yazabilirdik direkt
        System.out.println(l.run(5));

        System.out.print("Ornek 2 :");
        lambda2 l2 = ((x,y) -> x * y); //immutable bu x e 5 dediysen değiştiremezsin artık
        System.out.println(l2.run(5,7));

        System.out.println("Ornek 3 :");
        int j =5;
        LambdaExpression le = new LambdaExpression();
        System.out.println(""+(j*j));
        System.out.println(""+le.f(j));//referential transparency

        System.out.println("Ornek 4 :");//Diziler ve Sayılar
        List<Integer> intSeq = Arrays.asList(1,2,3);
        intSeq.forEach(x->System.out.println(x));

        System.out.println("Ornek 5 :");//Çok Satırlı Lambda
        List<Integer> intSeq2 = Arrays.asList(1,2,3);
        intSeq2.forEach(x-> {
            x+=2;
            System.out.println(" x:"+x);
            int y= x+2;
            System.out.println(" y:"+y);
        });

        System.out.println("Ornek 6 :");//Parametre tipini tanımladık
        List<Integer> intSeq3 = Arrays.asList(1,2,3);
        intSeq3.forEach((Integer x)-> {
            x+=2;
            System.out.println(" x:"+x);
            int y= x+2;
            System.out.println(" y:"+y);
        });

        System.out.println("Ornek 7 :");//Metot referansları
        List<Integer> intSeq4 = Arrays.asList(1,2,3);
        intSeq4.forEach(x-> System.out.println(x)); // veya
        intSeq4.forEach(System.out::println);

        System.out.println("Ornek 8 :");//Stream API
        List<Integer> intSeq5 = Arrays.asList(1,2,3);
        int sum = intSeq4.stream().map(x->x*x).reduce((x,y)->x+y).get();
        System.out.println(sum);

    }
}
