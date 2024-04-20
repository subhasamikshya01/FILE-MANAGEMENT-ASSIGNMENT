import java.io.File;
import java.util.Scanner;

public class DirectoryLister {
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
        
        // List all files and subdirectories in the specified directory
        System.out.println("Files and Subdirectories in " + directoryPath + ":");
        File[] filesAndDirs = directory.listFiles();
        if (filesAndDirs != null) {
            for (File fileOrDir : filesAndDirs) {
                System.out.println(fileOrDir.getName());
            }
        }
    }
}
