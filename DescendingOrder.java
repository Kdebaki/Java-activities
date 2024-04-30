package activity;
import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the character array: ");
        int size = scanner.nextInt();
        
        char[] charArray = new char[size];
        
        // Input characters into the array
        System.out.println("Enter " + size + " characters:");
        for (int i = 0; i < size; i++) {
            charArray[i] = scanner.next().charAt(0);
        }
        
        // Display characters in descending order
        System.out.println("Characters in descending order:");
        displayDescendingOrder(charArray);
        
        scanner.close();
    }
    
    // Method to display characters in descending order
    public static void displayDescendingOrder(char[] arr) {
        // Sort the character array in descending order
        sortDescending(arr);
        
        // Display the sorted array
        for (char ch : arr) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
    
    // Method to sort character array in descending order
    public static void sortDescending(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
