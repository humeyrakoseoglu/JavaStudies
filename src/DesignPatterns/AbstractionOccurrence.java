package DesignPatterns;

import java.util.ArrayList;

public class AbstractionOccurrence {
    public static void main(String[] args) {
        Dizi succession = new Dizi();
        succession.isim = "Succession";
        succession.bolumEkle(new Bolum("Celebration",1));

    }
}

class Dizi { // abstraction
    String isim;
    String yapimci;
    ArrayList <Bolum> bolumler = new ArrayList<Bolum>();
    void bolumEkle(Bolum b){
        bolumler.add(b);
    }
}

class Bolum { //occurence
    String bolumIsmi;
    int bolumNo;
    public Bolum(String bolumIsmi, int bolumNo){
        this.bolumIsmi=bolumIsmi;
        this.bolumNo=bolumNo;
    }
}

/*
class occurence{
    abstraction ab = new abstraction();
}

class abstraction{
    ArrayList <occurence> al = new ArrayList<occurence>();

}
 */