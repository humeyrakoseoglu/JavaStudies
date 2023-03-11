package DesignPatterns;

import java.util.ArrayList;

public class GeneralHierarchy {
    public static void main(String[] args) {
        yonetici ali = new yonetici("ali");
        calisan veli = new calisan("veli");
        calisan ahmet = new calisan("ahmet");
        ali.addCalisan(ahmet);
        ali.addCalisan(veli);
        System.out.println("Ahmet'in yoneticisi: "+ahmet.yonetici.isim);
        System.out.println("Veli'in yoneticisi: "+veli.yonetici.isim);
        System.out.println("Ali'in calisanlari: 0. "+ali.altlari.get(0).isim + " 1. " + ali.altlari.get(1).isim);
    }
}

class calisan{
    String isim;
    calisan yonetici;
    public calisan(){

    }
    public calisan(String isim){
        this.isim = isim;
    }
}

class yonetici extends calisan{
    ArrayList <calisan> altlari = new ArrayList<calisan>();
    public yonetici(String isim){
        super(isim);
    }
    public void addCalisan(calisan alt){
        altlari.add(alt);
        alt.yonetici=this;
    }
}

/*
class Node{
    Node SuperiorNode = new Node();
}
 */