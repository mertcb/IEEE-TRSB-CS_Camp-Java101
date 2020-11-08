import java.util.Scanner;

public class ArabaYol {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Arabanız kilometrede kaç kuruş yakıyor");
        double kurus = input.nextDouble();

        System.out.println("Arabanız kaç kilometre yol yaptı?");
        int km = input.nextInt();

        double toplamPara = kurus * km;
        System.out.println("Gittiğiniz yolda " + toplamPara + " lira ödeyeceksiniz.");

    }
}
