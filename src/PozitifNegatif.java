import java.util.Scanner;

public class PozitifNegatif {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        int sayi = input.nextInt();

        if (sayi>0){
            System.out.println("Sayı Pozitif");
        }else if(sayi<0){
            System.out.println("Sayı Negatif");
        }else{
            System.out.println("Sayı Sıfırdır");
        }

    }
}
