package OOP.inheritance;

public class Main {
    public static void main(String[] args) {
        insan ali = new insan();
        muhendis veli = new muhendis();
        veli.boy=180;
        System.out.println(veli.boy);
        ali.kilo=90;
        ali.yemek();
        System.out.println(ali.kilo);
        veli.maas=1000;
        System.out.println(veli.zam());
        veli.kilo = 80 ;
        veli.yemek();
        System.out.println(veli.kilo);
    }

}
