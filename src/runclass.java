
import java.util.Scanner;


public class runclass {
    
    public static void main(String[] args) throws InterruptedException {
        
        Scanner scanner = new Scanner (System.in);
        
        String islemler = "1-Bazal Metabozlima Hızı Hesapla\n"
                        +"2-1RM Hesapla (1Tekrar Max)\n"
                        +"3-Günlük Alman Gereken Proteini Hesapla\n"
                        +"4-Günlük Alman Gereken Min. Kalori Hesapla\n"
                        +"5-Vücut Kitle İndeksi Hesapla\n"
                        +"6-Yağ Oranı Hesapla\n"
                        +"7-Günlük Alınan Karbonhidrat Protein Miktarı Hesapla\n"
                        +"Çıkış İçin q'a basınız";
        
        while (true){
            
            System.out.println(islemler);
            System.out.println("Hesaplama Programına Hoşgeldiniz\n");
            System.out.println("------------------------------");
            System.out.println("Yapmak İstediğiniz İşlemi Seçiniz ");
        
            String islem = scanner.nextLine();
            programlar program1 = null;
            
            if(islem.equals("q")){
                System.out.println("Program Kapattılıyor..");
                break;
            }
            else if(islem.equals("1")){
                
                String cinsiyetsec = "1-Kadınlar İçin\n"
                                    +"2-Erkekler İçin\n"
                                    +"Ana Menüye Dönmek İçin q'a basınız\n";
                while(true){
                    System.out.println(cinsiyetsec);
                    System.out.println("Lütfen Cinsiyetinizi seçiniz");
                    String islem4 = scanner.nextLine();
                    
                    if(islem4.equals("q")){
                        System.out.println("Ana menüye dönülüyor..");
                        Thread.sleep(2000);
                        break;
                    }
                    else if(islem4.equals("1")){
                        System.out.print("İsminiz = ");
                        String isim = scanner.nextLine();
                        System.out.print("Lütfen Kilonuzu Giriniz = ");
                        int kilo = scanner.nextInt();
                        System.out.print("Lütfen Boyunuzu Giriniz (ör.187) = ");
                        int boy = scanner.nextInt();
                        System.out.print("Lütfen Yaşınızı Giriniz = ");
                        int yas = scanner.nextInt();
                        scanner.nextLine();
                        program1 = new ogrenci(isim, kilo, boy, yas);
                        program1.bazalMetabolizmaHesaplaKadin();
                        
                    }
                    else if(islem4.equals("2")){
                         System.out.print("İsminiz = ");
                         String isim = scanner.nextLine();
                         System.out.print("Lütfen Kilonuzu Giriniz = ");
                         int kilo = scanner.nextInt();
                         System.out.print("Lütfen Boyunuzu Giriniz (ör.187) = ");
                         int boy = scanner.nextInt();
                         System.out.print("Lütfen Yaşınızı Giriniz = ");
                         int yas = scanner.nextInt();
                         scanner.nextLine();
                         program1 = new ogrenci(isim, kilo, boy, yas);
                         program1.bazalMetabolizmaHesaplaErkek();
                    }
                }
            }
            else if (islem.equals("2")){
                //By Lander formula:
                System.out.println("1 Tekrar ile maksimum kaldırabileceğiniz kiloyu hesaplayın (Lander formül baz alınarak yapılmıştır..");
                System.out.println("Hesaplamak için önce kendinizin bildiği ağırlık ve tekrarı girin (ör. 100kg ile 5 tekrar)");
                System.out.print("Ağırlığı girin = ");
                int agirlik = scanner.nextInt();
                System.out.print("Tekrarı girin = ");
                int tekrar = scanner.nextInt();
                scanner.nextLine();
                System.out.println("1RM = " + (100 * agirlik)/(101.3 - 2.67123 * tekrar) + "kg");
            } 
            else if(islem.equals("3")){
                System.out.print("İsminiz = ");
                String isim = scanner.nextLine();
                System.out.print("Kilonuz = ");
                int kilo = scanner.nextInt();
                scanner.nextLine();
                program1 = new ogrenci(isim, kilo, kilo, kilo);
                program1.gunlukProtein();
            }
            else if (islem.equals("4")){
                
                String islem2 = "1- Çok az egzersiz veya hiç egzersiz yok\n"
                                +"2-Haftada 1-3 gün hafif egzersiz\n"
                                +"3-Haftada 3-5gün orta derecede egzersiz\n"
                                +"4-Haftada 6-7 Gün ağır egzersiz\n"
                                +"5-Çok ağır egzersiz, eğitim veya fiziksel bir iş\n"
                                +"Ana Menüye Dönmek İçin q'a basınız\n";
                while (true){
                    System.out.println(islem2);
                    System.out.print("Yaptığınız egzersiz düzeyini seçiniz = ");
                    String islemler2 = scanner.nextLine();
                    
                    if(islemler2.equals("1")){
                        System.out.print("Bazal Metabolizma Hızınızı Giriniz = ");
                        int bmh = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Günlük Alman Gereken Min. Kalori = " + bmh * 1.2 + "dir");
                    }
                    else if(islemler2.equals("2")){
                        System.out.print("Bazal Metabolizma Hızınızı Giriniz = ");
                        int bmh = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Günlük Alman Gereken Min. Kalori = " + bmh * 1.375 + "dir");
                    }
                    else if(islemler2.equals("3")){
                        System.out.print("Bazal Metabolizma Hızınızı Giriniz = ");
                        int bmh = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Günlük Alman Gereken Min. Kalori = " + bmh * 1.55 + "dir");
                    }
                    else if (islemler2.equals("4")){
                        System.out.print("Bazal Metabolizma Hızınızı Giriniz = ");
                        int bmh = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Günlük Alman Gereken Min. Kalori = " + bmh * 1.725 + "dir");
                    }
                    else if(islemler2.equals("5")){
                        System.out.print("Bazal Metabolizma Hızınızı Giriniz = ");
                        int bmh = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Günlük Alman Gereken Min. Kalori = " + bmh * 1.9 + "dir");
                    }
                    else if(islemler2.equals("q")){
                        System.out.print("Geri Dönülüyor..");
                        Thread.sleep(2000);
                        break;
                    }
                    else {
                        System.out.print("Yanlış işlem seçtiniz..");
                    }
                }
            }
            else if(islem.equals("5")){
                System.out.print("İsminiz = ");
                String isim = scanner.nextLine();
                System.out.print("Lütfen Kilonuzu Giriniz = ");
                int kilo = scanner.nextInt();
                System.out.print("Lütfen Boyunuzu Giriniz (ör. 1.87) = ");
                double boy = scanner.nextDouble();
                scanner.nextLine();
                double bki = kilo / (boy * boy);
                System.out.println("Vücut Kitle İndeksiniz Hesaplanıyor...");
                Thread.sleep(3000);
                System.out.print("Vücut Kitle İndeksiniz = " + kilo / (boy * boy) + "BMI'dır\n");
                if (bki < 18.5 ){
                    System.out.println("Zayıfsınız");
                }
                else if (bki >= 18.5 && bki< 25){
                    System.out.println("Normal");
                }
                else if ( bki >= 25 && bki < 30){
                    System.out.println("Fazla Kilolu");
                }
                else{
                    System.out.println("Obez");
                 }
            }
            else if(islem.equals("6")){
                String cinsiyet = "1-Kadınlar İçin\n"
                                 +"2-Erkekler İçin\n"
                                 +"Geri Dönmek İçin q'a basınız\n";
                while (true){
                    System.out.println(cinsiyet);
                    System.out.println("Cinsiyet Seçin = ");
                    String cinsiyet_secim = scanner.nextLine();
                    
                    if(cinsiyet_secim.equals("q")){
                        System.out.println("Ana Menüye dönülüyor..");
                        Thread.sleep(2000);
                        break;
                    }
                    else if(cinsiyet_secim.equals("1")){
                        // %BF = 495 / ( 1.29579 - 0.35004 * log10( bel + kalça - boyun ) + 0.22100 * log10( height ) ) - 450
                        System.out.print("Lütfen bel ölçünüzü giriniz (cm cinsinden) = ");
                        int bel = scanner.nextInt();
                        System.out.print("Lütfen kalça ölçünüzü giriniz (cm cinsinden ve en kalın yerinden ölçülmesi gerekiyor!) = ");
                        int kalca = scanner.nextInt();
                        System.out.print("Lütfen boyun ölçünüzü giriniz (cm cinsinden) (adem elmasının olduğu yerden ölçülmesi gerekiyor) = ");
                        int boyun = scanner.nextInt();
                        System.out.print("Lütfen Boyunuzu Giriniz (ör. 165) = ");
                        int boy = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Yağ Oranınız = %" + (495 / (1.29579 - 0.35004 * Math.log10(bel + kalca - boyun) + 0.22100 * Math.log10(boy)) - 450 ));
                    }
                    else if(cinsiyet_secim.equals("2")){
                        //495 / ( 1.0324 - 0.19077 * log10( bel - boyun ) + 0.15456 * log10( height ) ) - 450
                        System.out.print("Lütfen bel ölçünüzü giriniz (cm cinsinden) = ");
                        int bel = scanner.nextInt();
                        System.out.print("Lütfen boyun ölçünüzü giriniz (cm cinsinden) (adem elmasının olduğu yerden ölçülmesi gerekiyor) = ");
                        int boyun = scanner.nextInt();
                        System.out.print("Lütfen Boyunuzu Giriniz (ör. 165) = ");
                        int boy = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Yağ Oranınız = %" + (495 / (1.0324 - 0.19077 * Math.log10(bel - boyun) + 0.15456 * Math.log10(boy)) - 450));
                    }
                }
            }
            else if(islem.equals("7")){
                String kaloriProteinHesapla = "1-Karbonhidrat Hesapla\n"
                                             +"2-Protein Hesapla\n"
                                             +"Ana Menüye Dönmek İçin q'a basınız";
                
                while(true){
                    System.out.println(kaloriProteinHesapla);
                    System.out.println("Hesaplamak İstediğiniz İşlemi Seçin");
                    String islem3 = scanner.nextLine();
                    
                    double yulaf = 3.67;
                    double basmati_pirinc = 3.65;
                    double jasmine_pirinc = 3.40;
                    double yesilMercimek = 2.84;
                    double muz = 88.7;
                    double tam_bugday_ekmek = 247.1;
                    
                    double tavuk = 0.22;
                    double kirmizi_et = 0.25;
                    double yumurta = 6;
                    double yesil_mercimek = 0.09;
                    
                    if (islem3.equals("1")){
                        
                        System.out.print("Bugün YULAF tükettiniz mi? Tükettiyseniz kaç gr (ör.100) = ");
                        double tuketilen_yulaf = scanner.nextDouble();
                        System.out.print("Bugün Basmati Pirinç Tükettiniz mi tükettiyseniz kaç gr? (ör.100) = ");
                        double tuketilen_basmati = scanner.nextDouble();
                        System.out.print("Bugün Jasmine Pirinç tükettiniz mi? Tükettiyseniz kaç gr? (ör.100) = ");
                        double tuketilen_jasmine = scanner.nextDouble();
                        System.out.print("Bugün Yeşil Mercimek yediniz mi? Yediyseniz kaç gr? (ör.100) = ");
                        double tuketilen_yesilmercimek = scanner.nextDouble();
                        System.out.print("Bugün muz yediniz mi yediyseniz kaç adet (ör.2) = ");
                        double tuketilen_muz = scanner.nextInt();
                        System.out.print("Bugün Tam Buğday Ekmem yediniz mi yediyseniz kaç dilim (ör.2) = ");
                        double tuketilen_ekmek = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Bugün aldığınız kalori miktarı = " + (int)(yulaf * tuketilen_yulaf + basmati_pirinc * tuketilen_basmati
                                                                             + jasmine_pirinc * tuketilen_jasmine
                                                                             + yesilMercimek * tuketilen_yesilmercimek
                                                                             + muz * tuketilen_muz
                                                                             + tam_bugday_ekmek * tuketilen_ekmek) + " kalori\n" );
                    }
                    else if(islem3.equals("2")){
                        System.out.print("Bugün tavuk göğsü tükettiniz mi ? Tükettiyseniz kaç gr? (ör.100) = ");
                        double tuketilen_tavuk = scanner.nextDouble();
                        System.out.print("Bugün kırmızı et tükettiniz mi? Tükettiyseniz kaç gr (ör.100) = ");
                        double tuketilen_et = scanner.nextDouble();
                        System.out.print("Bugün kaç adet yumurta yediniz? (ör.5) = ");
                        double tuketilen_yumurta = scanner.nextDouble();
                        System.out.print("Bugün Yeşil Mercimek yediniz mi? Yediyseniz kaç gr? (ör.100) = ");
                        double tuketilen_yesilmercimek_protein = scanner.nextDouble();
                        System.out.println("Bugün aldığınız protein miktarı = " + (int)(tavuk * tuketilen_tavuk
                                                                                       +kirmizi_et * tuketilen_et
                                                                                       +yumurta * tuketilen_yumurta
                                                                                       +yesil_mercimek * tuketilen_yesilmercimek_protein) + " gr protein\n");
                    }
                    else if(islem3.equals("q")){
                        System.out.println("Bir önceki menüye dönülüyor..");
                        Thread.sleep(3000);
                        break;
                    }
                    
                }
            }
            else {
                System.out.println("Yanlış İşlem Seçtiniz...");
            }
        }
    }
}
