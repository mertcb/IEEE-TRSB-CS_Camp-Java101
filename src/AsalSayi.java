import java.util.Scanner;

public class AsalSayi {
    public static boolean asalMi(int sayi){

        for(int i = 2; i<sayi;i++){
            // % modulo bir bölme işleminden kalanı bize gösterir
            if(sayi % i == 0){
                return false;

            }
        }
        return true;
    }

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        System.out.println("Kaça kadar olan sayıları kontrol etmek istiyorsunuz?");
        int sayi = input.nextInt();

        for(int i = 2; i<sayi;i++){
            if(asalMi(i)){
                System.out.println(i + " sayısı asaldır!");
            }
        }

    }
}
