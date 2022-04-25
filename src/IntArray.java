import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IntArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();

        boolean error = false;
        //Mit den Scanner eingabe einlesen und Prufen dass die Eingabe gultig ist
        while (scanner.hasNext() && !error){
            try{
                list.add(scanner.nextInt());
            } catch (InputMismatchException e){
                System.out.println("Eingabe muss ein int sein");
                error = true;
            }
        }
        //wenn die Eingabe gultig ist dann die list ins Array eintragen
        // und die Array zum console schreiben
        if(!error) {
            int[] array = new int[list.size()];
            for (int i = 0; i < array.length; i++) {
                array[i] = list.get(i);
            }

            System.out.println("Die Array ist:");
            for (int num : array) {
                System.out.print(num + " ");
            }
        }


    }
}
