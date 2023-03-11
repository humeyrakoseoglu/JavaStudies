package ObjectClass;

class insan{
    int boy;
}

class ogrenci extends insan implements Cloneable{
    Object kopyala() throws CloneNotSupportedException {
        return this.clone();
    }
    Object kopyala2() throws CloneNotSupportedException { // üstteki ile aynı çalışıyor
        ogrenci temp = new ogrenci();
        temp.boy = this.boy;
        return temp;
    }

    boolean equals(ogrenci rhs){
        return this.boy == rhs.boy;
    }

    public String toString(){
        return "bu objenin boyu" + this.boy;
    }

}
public class ObjectApplication {
    public static void main(String[] args) throws CloneNotSupportedException {
        insan ali = new insan();
        insan ahmet = ali;
        ali.boy = 180;
        System.out.println(ali.boy);
        if(ali == ahmet){ // shallow copy
            System.out.println("eşitler");
        }
        if(ali.equals(ahmet)){ // deep copy
            System.out.println("eşitler2");
        }
        ogrenci ayse = new ogrenci();
        ayse.boy = 160;
        ogrenci fatma = (ogrenci) ayse.kopyala();
        System.out.println(ayse.boy);
        System.out.println(fatma.boy);
        fatma.boy = 190;
        ayse.boy = 190;
        System.out.println(ayse.boy);
        System.out.println(fatma.boy);
        if(ayse == fatma){ // shallow copy
            System.out.println("eşitler");
        }
        if(ayse.equals(fatma)){ // deep copy
            System.out.println("eşitler2");
        }
        System.out.println(ayse);
        System.out.println(ayse.hashCode());//her objenin kendisine özel id değeri
        System.out.println(fatma.hashCode());
    }
}
