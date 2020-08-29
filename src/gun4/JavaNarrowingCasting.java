package gun4;

public class JavaNarrowingCasting {
    //JavaCinsmDaraltma
    //Narrowing Casting (Manual - elle) Genis bir cinsi kücük bir cinse cevirme
    //double-->float-->long-->int-->char-->short-->byte

    public static void main(String[] args) {
        double ondalikliSayi = 1.3;
        int tamSayi = (int) ondalikliSayi;//bunu okurken sağdan sola doğru okuyacağız, ondalikliSayi int tamsayiya
        //Cast et demiş oluyoruz bu kodla
        System.out.println(ondalikliSayi);
        System.out.println(tamSayi);
    }
}
