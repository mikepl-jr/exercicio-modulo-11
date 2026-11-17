import java.util.Scanner;

public class ExercicioModulo11 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int [][] matriz = {
               {10, 20, 30},
               {40, 50, 60},
               {70, 80, 90}
       };

       for (int[] linha : matriz){
           for (int numero : linha){
               System.out.print(numero + " ");
           }
           System.out.println();
       }










       scanner.close();
    }
}
