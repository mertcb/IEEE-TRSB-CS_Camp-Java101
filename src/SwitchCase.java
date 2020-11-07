import java.util.Scanner;

public class SwitchCase {
    public static void main(String[]args){
        /*
            // ilkel yöntem
            if(kosul){

            }else if(baskaKosul){
            }else if(baskaKosul){
            }else if(baskaKosul){
            }else if(baskaKosul){
            }else if(baskaKosul){
            }else{

            }
         */

        /*
            switch(kosul){
                case a:
                    //burası çalışır
                case b:
                    //burası çalışır
                default:
                    burası çalışır
            }
         */

        Scanner input = new Scanner(System.in);

        System.out.println("İşlem Seçiniz");
        System.out.println("Toplama için 1");
        System.out.println("Çıkarma için 2");
        System.out.println("Çarpma için 3");
        System.out.println("Bölme için 4");

        int islem = input.nextInt();

        System.out.println("İlk sayıyı giriniz");

        int sayi1 = input.nextInt();

        System.out.println("İkinci sayıyı giriniz");

        int sayi2 = input.nextInt();

        switch (islem){
            case 1:
                int toplam = sayi1 + sayi2;
                System.out.println("Sonuç: " + toplam);
                break;
            case 2:
                int cikarma = sayi1 - sayi2;
                System.out.println("Sonuç: " + cikarma);
                break;
            case 3:
                int carpma = sayi1 * sayi2;
                System.out.println("Sonuç: " + carpma);
                break;
            case 4:
                double bolme = (double)sayi1 / sayi2;
                System.out.println("Sonuç: " + bolme);
                break;
            default:
                System.out.println("Yanlış İşlem seçtiniz");
                break;
        }
    }
}
