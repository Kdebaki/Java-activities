package activity;
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the square matrices: ");
        int n = scanner.nextInt();
        
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        int[][] result = new int[n][n];
        
        // Input elements for matrix1
        System.out.println("Enter elements for the first matrix:");
        inputMatrix(scanner, matrix1);
        
        // Input elements for matrix2
        System.out.println("Enter elements for the second matrix:");
        inputMatrix(scanner, matrix2);
        
        // Perform matrix multiplication
        multiplyMatrices(matrix1, matrix2, result);
        
        // Display the result matrix
        System.out.println("Result of matrix multiplication:");
        displayMatrix(result);
        
        scanner.close();
    }
    
    // Method to input elements for a matrix
    public static void inputMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    
    // Method to perform matrix multiplication
    public static void multiplyMatrices(int[][] matrix1, int[][] matrix2, int[][] result) {
        int n = matrix1.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
    }
    
    // Method to display elements of a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

