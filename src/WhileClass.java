public class WhileClass {
    public static void main(String[]args){
        /*

            while(koşul){
                 // koşul doğru olduğu sürece çalışır

            }
            break
            continue
         */

        int i = 0;

        while(i<10){
            if(i == 5){
                i++;
                continue;
            }
            System.out.println("Sayı " + i);
            i++;
        }

    }
}
