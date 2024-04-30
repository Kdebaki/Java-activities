package activity;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        Arrays.sort(array);
        
        System.out.println("Array elements in ascending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}
