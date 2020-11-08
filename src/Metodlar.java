import java.util.Scanner;

public class Metodlar {

    public static void selam(){
        Scanner input = new Scanner(System.in);
        System.out.println("İsminiz nedir?");
        String isim = input.nextLine();
        System.out.println("Hello, " + isim);
    }

    public static int faktoriyel(int sayi1){
        int faktoriyel = 1;

        for (int i = 1; i<=sayi1;i++){
            faktoriyel = faktoriyel*i;
        }

        return faktoriyel;
    }

    public static void toplama(int sayi1, int sayi2, int sayi3){
        System.out.println("Toplamları = " + (sayi1+sayi2+sayi3));
    }

    public static int ikiIleCarp(int sayi){
        return sayi*2;
    }

    public static int besIleTopla(int sayi){
        return sayi + 5;
    }

    public static int onIleCarp(int sayi){
        return sayi*10;
    }

    public static void main(String[]args){
        /*
            public
            private
            proctected
            package-protected
         */
        int sayi = 10;
        System.out.println(besIleTopla(onIleCarp(ikiIleCarp(sayi))));


    }

}
