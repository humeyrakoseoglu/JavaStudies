package ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws myException {
        File f = new File("a.txt");
        try{
            BufferedReader br = new BufferedReader(new FileReader(f));
            int x=10;
            int a[] = new int[x];
            System.out.println(a[29]);
        }catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Array boyutu aşıldı");
            ae.printStackTrace();
        }
        catch(Exception e){

        }
        deneme d = new deneme();
        d.f(5);
       // d.g();
    }

}

class myException extends  Exception{

}
class deneme {
    void g(int x) throws myException {
        f(10);
    }
    void f(int x) throws myException {
    throw new myException();
    }
}
