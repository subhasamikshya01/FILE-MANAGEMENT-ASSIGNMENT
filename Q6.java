import java.io.File;
import java.util.Scanner;

public class FileDeleter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the file name to be deleted
        System.out.print("Enter the name of the file to be deleted: ");
        String fileName = scanner.nextLine();
        
        // Create a File object for the specified file name
        File file = new File(fileName);
        
        // Check if the file exists
        if (!file.exists()) {
            System.out.println("File \"" + fileName + "\" does not exist.");
            return;
        }
        
        // Attempt to delete the file
        boolean isDeleted = file.delete();
        
        // Check if the deletion was successful
        if (isDeleted) {
            System.out.println("File \"" + fileName + "\" has been successfully deleted.");
        } else {
            System.out.println("Failed to delete file \"" + fileName + "\".");
        }
    }
}
