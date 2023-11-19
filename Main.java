import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double resulta = 0;
       Scanner scanner = new Scanner(System.in);
           write("Choisez un nombre :");
           double nombre1 = Double.parseDouble(scanner.nextLine());

           write("Choisez un opérateur :");
           String operateur = scanner.nextLine();

           write("Choisez un 2ème nombre :");
           double nombre2 = Double.parseDouble(scanner.nextLine());

           if(Objects.equals(operateur, "+")){
            resulta = (double) nombre1 + nombre2;
           }
            if(Objects.equals(operateur, "*")){
                resulta = (double) nombre1 * nombre2;
            }
            if(Objects.equals(operateur, "-")){
                resulta = (double) nombre1 - nombre2;
            }
            if(Objects.equals(operateur, "/")){
                resulta = (double) nombre1 / nombre2;
            }

           write("le resulta est :" + resulta);

     }



    private static void delay(int temps){
        try {
            Thread.sleep(temps);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static void write(String text){
        System.out.println(text);

    }
}