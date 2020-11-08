public class DoWhileClass {
    public static void main(String[]args){
        /*

            while(kosul){
                //koşul doğru olduğu sürece
            }

            do{
                // bir kere çalışır
            }while(kosul)

         */

        int i = 10;

        do{
            System.out.println("sayı " + i);
            i--;
        }while (i>0);

        // i = 0

        i = 10;
        while (i > 0) {
            System.out.println("while döngüsündeki sayı " + i);
            i--;
        }

    }
}
