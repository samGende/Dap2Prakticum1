import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EnumeratePermutations {
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
        if(!error) {
            int[] array = new int[list.size()];
            for (int i = 0; i < array.length; i++) {
                array[i] = list.get(i);
            }

            //keine elemente Festgelegt weil wir wollen alle permutations finden
            printPermutations(array, 0);
        }



    }

    private static int printPermutations(int[] array, int festgelegt){
        //break case fuer recursion
        if(array.length == (festgelegt + 1)){
            System.out.println(Arrays.toString(array));
            return 1;
        } else {
            int sum = 0;

            // jedes permutation von festgelegt - array.length finden
            for(int i = festgelegt; i < array.length; i++){
                //array[i] und array[festgelegt] werden vertauscht um ein neues permutation zu finden
                int temp = array[i];
                array[i] = array[festgelegt];
                array[festgelegt] = temp;
                int[] copy = new int[array.length];
                sum+= printPermutations(array, festgelegt+ 1);
                array[festgelegt] = array[i];
                array[i] = temp;

            }
            return sum;
        }

    }
}
