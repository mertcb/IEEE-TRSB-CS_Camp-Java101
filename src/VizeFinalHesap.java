import java.util.Scanner;

public class VizeFinalHesap {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Dersinizin İsmini Giriniz");
        String dersIsim = input.nextLine();
        System.out.println("Vize 1 Notunu Giriniz: ");
        int vize1 = input.nextInt();
        System.out.println("Vize 2 Notunu Giriniz: ");
        int vize2 = input.nextInt();
        System.out.println("Final Notunu Giriniz: ");
        int finalNot = input.nextInt();

        double toplamNot = (vize1 * 30 / 100) + (vize2*30/100) + (finalNot*40/100);

        if(toplamNot >=90 && toplamNot<=100){
            System.out.println(dersIsim + " adlı dersten AA aldınız.Aldığınız not: " + toplamNot);
        }else if(toplamNot < 90 && toplamNot >=85){
            System.out.println(dersIsim + " adlı dersten BA aldınız.Aldığınız not: " + toplamNot);
        }else if(toplamNot < 85 && toplamNot >=80){
            System.out.println(dersIsim + " adlı dersten BB aldınız.Aldığınız not: " + toplamNot);
        }else if(toplamNot < 80 && toplamNot >=75){
            System.out.println(dersIsim + " adlı dersten CB aldınız.Aldığınız not: " + toplamNot);
        }else if(toplamNot < 75 && toplamNot >=70){
            System.out.println(dersIsim + " adlı dersten CC aldınız.Aldığınız not: " + toplamNot);
        }else if(toplamNot < 70 && toplamNot >=65){
            System.out.println(dersIsim + " adlı dersten CD aldınız. Aldığınız not: " + toplamNot);
        }else if(toplamNot < 65 && toplamNot >=60){
            System.out.println(dersIsim + " adlı dersten DD aldınız. Aldığınız not: " + toplamNot);
        }else {
            System.out.println(dersIsim + " adlı dersten kaldınız. Tekrar almanız gerekmektedir.Aldığınız not: " + toplamNot);
        }
    }
}

// "75"