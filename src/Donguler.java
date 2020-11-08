import java.util.Scanner;

public class Donguler {
    /*
        for
        while
        do-while
     */
    public static void main(String[]args){
        /*

            for(başlatma; koşul; artırma/azaltma){

            }
         */

        /*
         i = i+1;
         i++
         i = i-1;
         i--
         */

        /*for(int i=1; i<=10; i = i*2){
            System.out.println("IEEE TRSB Computer Society Camp, i sayısı= " + i);
        }*/


        // Faktöriyel => 4! = 4x3x2x1  1x2x3x4

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz:");

        int sayi = input.nextInt();

        int faktoriyel = 1;

        for(int i=1; i<=sayi; i++){
            faktoriyel = faktoriyel*i; // 1*1, 1*2, 2*3, 6*4 = 24 = 4!
            System.out.println("Faktöriyel = " + faktoriyel + " i = " + i);
        }

        System.out.println("Faktoriyel sonucu = " + faktoriyel);

    }
}
