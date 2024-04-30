import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        System.out.print("Введите имя файла -> ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);

            int[] nums = (int[]) ois.readObject();
            ois.close();

            int count = 0;
            boolean sorted = false;
            while (!sorted) {
                sorted = true;
                for (int i = 1; i < nums.length; i++) {
                    if (nums[i] < nums[i - 1]) {
                        int temp = nums[i];
                        nums[i] = nums[i - 1];
                        nums[i - 1] = temp;
                        sorted = false;
                    }
                }
            }

            int midNum = nums[nums.length / 2];

            for (int i = 0; i < nums.length; i++) {
                while (nums[i] != midNum) {
                    if (nums[i] < midNum) {
                        nums[i] = nums[i] + 1;
                        count++;
                    } else if (nums[i] > midNum) {
                        nums[i] = nums[i] - 1;
                        count++;
                    }
                }
            }
            System.out.printf("Минимальное колличество шагов - %d\n", count);
        }
        catch(IOException e) {
            System.out.println("IOException\n Файл не найден.");}
        catch(ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");}
    }
}
