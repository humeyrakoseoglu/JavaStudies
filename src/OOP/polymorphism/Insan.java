package OOP.polymorphism;

public class Insan {
    int boy;
    int kilo;

    public Insan(){
    }

    public  Insan(int boy, int kilo){
        if(boy>0 && kilo>0){
            this.boy = boy;
            this.kilo = kilo;
        }
        System.out.println("yeni bir insan oluştu");
    }
    void yemek(){
        kilo++;
    }
}
