import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]);
            int m = Integer.parseInt(args[1]);
            int[] numbers = new int[n];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = i + 1;
            }
            int count = 0;
            System.out.print("Полученный путь: ");
            do {
                System.out.print(numbers[count]);
                count = (count + m - 1) % n;
            } while (count != 0);
            System.out.print(".");

        }catch(NegativeArraySizeException e){
            System.out.println("NegativeArraySizeException");
        }
    }
}
