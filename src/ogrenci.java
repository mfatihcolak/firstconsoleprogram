
import java.util.Scanner;


public class ogrenci extends programlar {
    
    private double kilo;
    private double boy;
    private int yas;

    public ogrenci(String ogrenciIsim, double kilo, double boy, int yas) {
        super(ogrenciIsim);
        this.kilo = kilo;
        this.boy = boy;
        this.yas = yas;
        
    }

    @Override
    void bazalMetabolizmaHesaplaKadin() {
        
        System.out.println(getOgrenciIsim() + " in bazal metabolizma hızı = " + (655 + 9.6 * kilo + 1.8 * boy - 4.7 * yas) + "dir");
    }

    @Override
    void gunlukProtein() {
        System.out.println(getOgrenciIsim() + " alman gereken günlük protein = " + kilo * 2.25 + "gr");
    }
    
    @Override
    void bazalMetabolizmaHesaplaErkek() {
        
        System.out.println(getOgrenciIsim() + " in bazal metabolizma hızı = " + (66 + 13.7 * kilo + 5 * boy - 6.8 * yas) + "dir");

    }    

  
}
