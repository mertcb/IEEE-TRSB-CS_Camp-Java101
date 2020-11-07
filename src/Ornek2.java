import java.util.Scanner;

public class Ornek2 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Sayı 1 i giriniz");
        int sayi1 = input.nextInt();
        System.out.println("Sayı 2 i giriniz");
        int sayi2 = input.nextInt();

        int toplam = sayi1 + sayi2;

        int cikarma = sayi1 - sayi2;

        int carpma = sayi1 * sayi2;

        double bolme = (double) sayi2 / (double) sayi1;

        System.out.println("Toplamları" + " " + toplam);
        System.out.println("Çıkarma " + cikarma);
        System.out.println("Çarpımları " + carpma);
        System.out.println("Bölümleri " + bolme);

    }
}
