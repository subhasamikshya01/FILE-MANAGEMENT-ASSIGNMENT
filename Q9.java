import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileMetadataDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the file name
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        
        // Create a File object for the specified file name
        File file = new File(fileName);
        
        // Check if the file exists
        if (!file.exists()) {
            System.out.println("The specified file does not exist.");
            return;
        }
        
        // Display metadata of the file
        System.out.println("File Metadata:");
        System.out.println("Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Size: " + file.length() + " bytes");
        
        // Last modified date
        long lastModifiedMillis = file.lastModified();
        Date lastModifiedDate = new Date(lastModifiedMillis);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Last Modified: " + dateFormat.format(lastModifiedDate));
        
        // Other available attributes
        System.out.println("Is Directory: " + file.isDirectory());
        System.out.println("Is Hidden: " + file.isHidden());
        System.out.println("Can Read: " + file.canRead());
        System.out.println("Can Write: " + file.canWrite());
    }
}
