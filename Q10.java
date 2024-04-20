import java.io.File;
import java.util.Scanner;

public class RecursiveDirectoryLister {
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
        
        // Call the recursive listing function
        System.out.println("Contents of " + directoryPath + ":");
        listFilesRecursive(directory, 0);
    }
    
    // Recursive function to list files and subdirectories
    private static void listFilesRecursive(File directory, int depth) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                // Print indentation for nested files and directories
                for (int i = 0; i < depth; i++) {
                    System.out.print("  ");
                }
                
                // Print file or directory name
                System.out.println(file.getName());
                
                // If it's a directory, recursively list its contents
                if (file.isDirectory()) {
                    listFilesRecursive(file, depth + 1);
                }
            }
        }
    }
}
