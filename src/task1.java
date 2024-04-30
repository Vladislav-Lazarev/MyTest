import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива -> ");
        int n = scanner.nextInt();

        System.out.print("Введите длину шага -> ");
        int m = scanner.nextInt();

        int[] numbers = new int[n];

        for(int i=0; i<numbers.length; i++){
            numbers[i] = i + 1;
        }

        System.out.print("Круговой массив: ");
        for(int number:numbers){
            System.out.print(number);
        }
        System.out.println();

        int count = 0;
        System.out.print("Путь: ");
        do{
            System.out.print(numbers[count]);
            count = (count + m - 1) % n;
        }while(count != 0);
    }
}
