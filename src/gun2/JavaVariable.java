package gun2;

public class JavaVariable {
    //ilk hafleri büyük yazmaya CamelCase deniyor
    public static void main(String[] args) {

        int age = 10; //assigment yapma, atama. initialize yapma değer atama
        int year; //declaring tanımlama

        System.out.println("ilk yaş değerim : "+age);
        age = 15; //assign different value, yeniden değer atama
        //java kodları yukardan aşağı doğru ve soldan sağa doğru okuyor. Biz ise javanın tersine
        //sağdan sola okumalıyız yani 15'i age ye atıyorum gibi
        System.out.println("ikinci yaş değerim : "+age);

        //int 2a = 11;  variableler sayı ile başlayamaz.
        int €=5;
        System.out.println(€);
        int _a =4;
        System.out.println(_a);

        int x = 5;
        int y = 7;
        int z = x+y;
        int t = 2*x+y;
        System.out.println(t);

    }
}
