package gun4;

public class JavaWideningCasting {
    //Widening (Genişletme) Casting (Otomatik) Küçük bir cinsi geniş cinse cevirme
    //byte -> short -> char -> int -> long -> float -> double

    public static void main(String[] args) {


        int number = 50;
        double decimal = number;// decimal : ondalıklı sayı

        System.out.println(number);
        System.out.println(decimal);
    }
}
