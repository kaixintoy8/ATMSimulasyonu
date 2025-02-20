import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int Pin = 1189;
        double Bakiye = 5000;
        String islem = "";

        System.out.print("PIN kodunuzu giriniz: ");
        int sayi= scanner.nextInt();

        if (sayi==Pin){
            System.out.println("Giriş başarılı!");

            while (!islem.equalsIgnoreCase("çıkış")){
                System.out.println("MENÜ");
                System.out.println("Bakiye Görüntüleme");
                System.out.println("Para Yatırma");
                System.out.println("Para Çekme");
                System.out.println("Çıkış");
                System.out.println("Yapmak istediğiniz işlemi yazınız: ");
                islem =scanner.nextLine();

                if (islem.equalsIgnoreCase("Para çekmek istiyorum")){
                    System.out.print("Çekmek istediğniz tutarı giriniz: ");
                    double cekilicekTutar =scanner.nextDouble();

                    if (cekilicekTutar>Bakiye){
                        System.out.println("Yetersiz bakiye! Mevcut bakiyeniz: " + Bakiye+"TL");
                    }
                    else {
                        Bakiye-=cekilicekTutar;
                        System.out.println("Güncel bakiyeniz: "+Bakiye+"TL");
                    }
                }
            }
        }
        else {
            System.out.print("PİN kodunuz yanlış!");
        }
    }
}