import java.io.File;
import java.util.Scanner;

public class TxtFileLister {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a directory path
        System.out.print("Enter the directory path: ");
        String directoryPath = scanner.nextLine();
        
        // Create a File object for the specified directory path
        File directory = new File(directoryPath);
        
        // Check if the directory exists
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Directory does not exist.");
            return;
        }
        
        // List all ".txt" files in the specified directory
        System.out.println("Text Files in " + directoryPath + ":");
        File[] files = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }
}
