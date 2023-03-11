package OOP.polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        Insan ali = new Insan();

        Muhendis veli = new Muhendis();
        Muhendis humeyra = new Muhendis(20000,153,47);
        System.out.println("hum maaş: "+humeyra.maas);
        System.out.println("veli maaş: "+veli.maas);
        veli.maas = 1000;
        veli.zam(20);
        System.out.println(veli.maas);
        veli.zam((float)0.50);
        System.out.println(veli.maas);

    }

}

