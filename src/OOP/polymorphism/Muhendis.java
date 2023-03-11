package OOP.polymorphism;

public class Muhendis extends Insan{
    int maas;

    public Muhendis(){
        this.maas = 7000; //ya da this(7000); kullanırız. parametre alan constructor metodu çağıracak
    }

    public Muhendis(int maas){
        if(maas>0){
            this.maas = maas;
        }else{
            this.maas = 7000;
        }
    }

    public Muhendis(int maas, int boy, int kilo){
        super(boy,kilo);
        this.maas = maas;
    }
    int zam(){
        maas++;
        return maas;
    }

    //overloading: fonk ismi aynı parametre ismi ya da tipi değişecek
    int zam(int zamMiktari){
        maas+=zamMiktari;
        return maas;
    }

    int zam(float zamOrani){
        float artis= zamOrani*maas;
        zam((int)artis);
        return maas;
    }

    void yemek(){
        kilo+=2;
    }
    //overriding
      void yemek(int kilo){
          this.kilo=kilo;
      }
}
