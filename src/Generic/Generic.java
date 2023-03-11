package Generic;
/*
 Genericler, parametreleştirilmiş türler anlamına gelir .
 Fikir, türün (Tamsayı, Dize, vb. ve kullanıcı tanımlı türler) yöntemler, sınıflar ve arabirimler için bir parametre olmasına izin vermektir.
 Genericleri kullanarak, farklı veri türleri ile çalışan sınıflar oluşturmak mümkündür.
 Parametre türünde 'int', 'char' veya 'double' gibi ilkelleri kullanamayız.
 */
public class Generic {
    /* To create an instance of generic class
    BaseType <Type> obj = new BaseType <Type>()*/
    public static void main(String[] args)
    {
        // instance of Integer type
        Test<Integer> iObj = new Test<Integer>(24);
        System.out.println(iObj.getObject());

        // instance of String type
        Test<String> sObj
                = new Test<String>("HumeyraKoseoglu");
        System.out.println(sObj.getObject());

        // iObj = sObj; // This results an error

        Test2 <String, Integer> obj =
                new Test2<String, Integer>("HUM", 25);
        obj.print();


        Test2 <Integer, String> obj2 =
                new Test2<Integer, String>(25,"HUM" );
        obj2.print();
    }

}


// We use < > to specify Parameter type
class Test<T> {
    // An object of type T is declared
    T obj;
    Test(T obj) { this.obj = obj; } // constructor
    public T getObject() { return this.obj; }
}

class Test2<T, U>
{
    T obj1;  // An object of type T
    U obj2;  // An object of type U

    // constructor
    Test2(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    // To print objects of T and U
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

