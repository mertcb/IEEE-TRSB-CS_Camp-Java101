import java.util.Scanner;

public class IfElse {
    public static void main(String[]args){
        /*

        if(kosul){
            buradaki kod çalışıyor
        }else{
            yanlış olduğunda burası çalışır
        }

         */

        Scanner input = new Scanner(System.in);

        String isim = input.nextLine();

        if(isim.equals("Mert")){ // ^M.$
            System.out.println("Hoşgeldin Mert");
        }else{
            System.out.println("You shall not pass!");
        }

    }
}
