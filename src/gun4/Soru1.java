package gun4;

public class Soru1 {
    //double d=(50/3) ya da  double d=(double) (50/3) mi olmalı?
    public static void main(String[] args) {
        double d=(50/3); // 16.0 bölen değerimiz int olduğu için sonucuda int gibi verecek
        System.out.println(d);
        double e = 50/3;
        System.out.println(e);
        double f = 50/3.0;// bölen değer double olduğu için sonuçta double çıkacak
        System.out.println(f);
        double g =50.0/3;  //16.666666666666668
        System.out.println(g);
        double h = 50.0/3.0;
        System.out.println(h);

    }
}
