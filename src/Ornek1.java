import java.util.Scanner;

public class Ornek1 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz");
        int sayi = input.nextInt();
        input.nextLine();

        System.out.println("Bir isim giriniz");

        String isim = input.nextLine();

        System.out.println("Hello, " + isim + sayi);

    }
}
