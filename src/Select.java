import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Select {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        boolean error = false;

        while (scanner.hasNext() && !error){
            try{
                list.add(scanner.nextInt());
            } catch (InputMismatchException e){
                System.out.println("Eingabe muss ein int sein");
                error = true;
            }
        }
        int [] array = new int[list.size()];
        for(int i = 0; i < array.length; i++ ){
            array[i]= list.get(i);
        }
        Arrays.sort(array);

        int k = 0;
        // k als argument einnehmen und pruffen dass es gultig ist
        try {
            k = parseInt(args[0]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.print("No argument for K provided");
            error= true;
        } catch (NumberFormatException e){
            System.out.println("Argument for K must be an int");
            error= true;
        }

        if(!error) {
            // array grosse muss grosser als k sein
            if (k > array.length) {
                System.out.println("List must contain k=" + k + " numbers " + array.length + "were provided.");
            }
            // k ist eine gultige wert und die ausgabe wird zum console geschrieben
            else if (k > 0) {
                System.out.println("The " + k + "-smallest number is " + array[k - 1]);
            } else {
                System.out.println("Input K must me larger than 0");
            }
        }




    }
}
