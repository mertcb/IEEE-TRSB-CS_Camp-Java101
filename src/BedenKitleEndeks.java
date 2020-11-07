import java.util.Scanner;

public class BedenKitleEndeks {
    public static void main(String[]args){

        // Beden Kitle Endeksi = Kilo / (Boy * Boy)
        /*

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Kilonuzu Giriniz: ");

        double kilo = input.nextDouble();

        System.out.println("Boyunuzu Giriniz: ");

        double boy = input.nextDouble();

        double bke = kilo / (boy*boy);

        if(bke < 18.5){
            System.out.println("Fazla zayıfsınız. Beden Kitle Endeksiniz = " +bke );
        }else if(bke>=18.5 && bke < 25){
            System.out.println("Beden Kitle Endeksiniz Normal Beden Kitle Endeksiniz = " +bke);
        }else if(bke>=25 && bke<30){
            System.out.println("Fazla Kilolusunuz Beden Kitle Endeksiniz = " +bke);
        }else {
            System.out.println("Obezsiniz Beden Kitle Endeksiniz = " +bke);
        }

    }
}
