import java.util.Scanner;

public class Diziler {
    public static void main(String[]args){
        /*
            Diziler
         */

        int[] dizi1 = {0,1,2,3,4,5,6,7,8,9};

        int[] dizi2 = new int[5];


        for (int i = 0; i<dizi1.length;i++){ // dizinin uzunluğunu dizi1.length olarak buluyoruz
            System.out.print(dizi1[i]); // dizinin elemanına erişirken dizi1[index]
            // dizi1[0] Dizi indeksi her zaman 0 dan başlar
        }
        // [1,2,3,4,5,6,7,8,9,0]
        System.out.println();
        // foreach döngüsü
        for (int i:dizi1){
            System.out.print(dizi1[i]);
        }

        System.out.println();
        Scanner input = new Scanner(System.in);

        for (int i = 0;i<dizi2.length;i++){
            System.out.println("Diziye eklemek için bir sayı giriniz");
            int sayi = input.nextInt();
            dizi2[i] = sayi; // dizi2[0] = 20; dizi2[1] = 19;
        }

        System.out.println();

        for (int i:dizi2){
            System.out.print(i + " ");
        }

        String[] dizi3 = {"Ali", "Veli", "Mert"};

        for(String eleman: dizi3){
            System.out.println(eleman + " ");
        }

    }
}
