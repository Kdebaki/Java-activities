package activity;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();
        
        // Create a list to store names
        List<String> namesList = new ArrayList<>();
        
        // Input names
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            namesList.add(name);
        }
        
        // Display the list of names
        System.out.println("List of names:");
        displayNames(namesList);
        
        // Perform search for a given name
        System.out.print("Enter the name to search for: ");
        String searchName = scanner.next();
        boolean found = searchName(namesList, searchName);
        
        if (found) {
            System.out.println("Name '" + searchName + "' found in the list.");
        } else {
            System.out.println("Name '" + searchName + "' not found in the list.");
        }
        
        scanner.close();
    }
    
    // Method to display list of names
    public static void displayNames(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
    
    // Method to search for a given name in the list
    public static boolean searchName(List<String> names, String searchName) {
        for (String name : names) {
            if (name.equals(searchName)) {
                return true;
            }
        }
        return false;
    }
}

