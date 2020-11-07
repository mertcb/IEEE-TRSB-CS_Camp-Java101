import java.util.Scanner;

public class Hipotenus {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.println("A sayısı giriniz: ");
        int a = input.nextInt();
        System.out.println("B sayısı giriniz: ");
        int b = input.nextInt();


        System.out.println("a^b " + Math.pow(a,b));
        System.out.println(Math.abs(a));

    }
}
