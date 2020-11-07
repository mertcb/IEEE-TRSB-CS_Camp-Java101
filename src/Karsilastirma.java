public class Karsilastirma {
    public static void main(String[]args){

        int sayi1 = 1;
        int sayi2 = 4;

        /*System.out.println(sayi1 != sayi2);
        System.out.println(sayi1 > sayi2);
        System.out.println(sayi1 < sayi2);
        System.out.println(sayi1 >= sayi2);
        System.out.println(sayi1 <= sayi2);*/

        boolean esitDegil = sayi1 != sayi2;
        //System.out.println(esitDegil);

        /*
            a && b => a "ve" b
            a || b => a "veya" b

         */

        boolean dogru = true;
        boolean yanlis = false;
        System.out.println(!(dogru || yanlis));

        System.out.println("Mert" == "mert");

        System.out.println(0.2 >= 0.2);

    }
}
