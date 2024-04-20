import java.io.File;
import java.util.Scanner;

public class FileRenamer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the current file name
        System.out.print("Enter the current file name: ");
        String currentFileName = scanner.nextLine();
        
        // Prompt the user for the new file name
        System.out.print("Enter the new file name: ");
        String newFileName = scanner.nextLine();
        
        // Create File objects for the current and new file names
        File currentFile = new File(currentFileName);
        File newFile = new File(newFileName);
        
        // Check if the current file exists
        if (!currentFile.exists()) {
            System.out.println("The specified current file does not exist.");
            return;
        }
        
        // Check if the new file name already exists
        if (newFile.exists()) {
            System.out.println("A file with the specified new name already exists. Rename aborted.");
            return;
        }
        
        // Rename the file
        if (currentFile.renameTo(newFile)) {
            System.out.println("File renamed successfully from \"" + currentFileName + "\" to \"" + newFileName + "\".");
        } else {
            System.out.println("Failed to rename the file.");
        }
    }
}
