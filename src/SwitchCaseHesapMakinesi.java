import java.util.Scanner;

public class SwitchCaseHesapMakinesi {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2;
        boolean cikis = false;
        while(!cikis){
            System.out.println("İşlem Seçiniz");
            System.out.println("Toplama için 1");
            System.out.println("Çıkarma için 2");
            System.out.println("Çarpma için 3");
            System.out.println("Bölme için 4");
            System.out.println("Çıkış için 5");
            int islem = input.nextInt();

            switch (islem){
                case 1:
                    System.out.println("İlk sayıyı giriniz");

                    sayi1 = input.nextInt();

                    System.out.println("İkinci sayıyı giriniz");

                    sayi2 = input.nextInt();
                    int toplam = sayi1 + sayi2;
                    System.out.println("Sonuç: " + toplam);
                    break;
                case 2:
                    System.out.println("İlk sayıyı giriniz");

                    sayi1 = input.nextInt();

                    System.out.println("İkinci sayıyı giriniz");

                    sayi2 = input.nextInt();
                    int cikarma = sayi1 - sayi2;
                    System.out.println("Sonuç: " + cikarma);
                    break;
                case 3:
                    System.out.println("İlk sayıyı giriniz");

                    sayi1 = input.nextInt();

                    System.out.println("İkinci sayıyı giriniz");

                    sayi2 = input.nextInt();
                    int carpma = sayi1 * sayi2;
                    System.out.println("Sonuç: " + carpma);
                    break;
                case 4:
                    System.out.println("İlk sayıyı giriniz");

                    sayi1 = input.nextInt();

                    System.out.println("İkinci sayıyı giriniz");

                    sayi2 = input.nextInt();
                    double bolme = (double)sayi1 / sayi2;
                    System.out.println("Sonuç: " + bolme);
                    break;
                case 5:
                    cikis = true;
                    break;
                default:
                    System.out.println("Yanlış İşlem seçtiniz");
                    break;
            }
        }
    }
}
