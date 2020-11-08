import java.util.Scanner;

public class ATM {
    public static void main(String[]args){
        /*
            1. bakiye sorgulama
            2. para çekme
            3. para yatıma
            4. çıkış
         */
        Scanner input = new Scanner(System.in);
        int bakiye = 1000;
        boolean cikis = false;
        while (!cikis){
            System.out.println("ATM'ye hoş geldiniz!");
            System.out.println("Bakiye Sorgulamak için 1");
            System.out.println("Para çekmek için 2");
            System.out.println("Para yatırmak için 3");
            System.out.println("Çıkış yapmak için 4");
            int islem = input.nextInt();
            switch (islem){
                case 1:
                    System.out.println("Bakiyeniz = " + bakiye);
                    break;
                case 2:
                    System.out.println("Ne kadar çekmek istiyorsunuz?");
                    int cekilen = input.nextInt();
                    if(bakiye - cekilen < 0){
                        System.out.println("Yeterli bakiyeniz yok.");
                    }else {
                        bakiye = bakiye - cekilen;
                        System.out.println("Para çektiniz, yeni bakiyeniz = " + bakiye);
                    }
                    break;
                case 3:
                    System.out.println("Ne kadar yatırmak istiyorsunuz?");
                    int yatirilan = input.nextInt();
                    bakiye = bakiye + yatirilan;
                    System.out.println("Paranız yatırıldı, yeni bakiyeniz = " + bakiye);
                    break;
                case 4:
                    cikis = true;
                    break;
                default:
                    System.out.println("Yanlış işlem seçtiniz");
                    break;
            }
        }
        System.out.println("ATM'yi kullandığınız için teşekkür ederiz");
    }
}
