import java.util.Scanner;
public class ödev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bakiye = 1000.0; // Başlangıç bakiyesi

        while (true) {
            System.out.println("ATM'ye hoş geldiniz!");
            System.out.println("1. Bakiye Sorgulama");
            System.out.println("2. Para Çekme");
            System.out.println("3. Para yatırmak ");
            System.out.println("4. Çıkış");
            System.out.print("Lütfen seçiminizi yapın: ");
            int secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    System.out.println("Bakiyeniz: " + bakiye + " TL");
                    break;
                case 2:
                    System.out.print("Çekmek istediğiniz miktarı girin: ");
                    double cekilecekMiktar = scanner.nextDouble();

                    if (cekilecekMiktar <= bakiye) {
                        bakiye -= cekilecekMiktar;
                        System.out.println("Yeni bakiyeniz: " + bakiye + " TL");
                    } else {
                        System.out.println("Yetersiz bakiye. İşlem iptal edildi.");
                    }
                    break;
                case 3 :
                    System.out.print("Yatırmak istedğiniz miktarı giriniz : ");
                    int yatırım = scanner.nextInt();
                    if( yatırım != 0){
                        bakiye+=yatırım;
                        System.out.print("GÜNCEL BAKİYENİZ : " +  bakiye+  " TL ");
                    }
                    else {
                        System.out.println("GEÇERSİZ BİR DEĞER GİRDİNİZ ");
                    }
                    break;
                        
                case 4:
                    System.out.println("Çıkış yapılıyor. İyi günler!");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        }
    }
}
