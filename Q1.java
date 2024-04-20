import java.io.*;
import java.util.*;

public class DiaryWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a diary entry
        System.out.print("Enter your diary entry: ");
        String entry = scanner.nextLine();
        
        // Get the current date
        Date currentDate = new Date();
        
        // Define the file name
        String fileName = "diary.txt";
        
        File file = new File(fileName);
        
        try {
            // Check if the file already exists
            if (file.exists()) {
                System.out.println("Warning: The file already exists. Appending to existing content.");
            }
            
            // Open the file in append mode
            FileWriter fileWriter = new FileWriter(fileName, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            // Write the current date followed by the user's entry
            printWriter.println("Date: " + currentDate);
            printWriter.println("Entry: " + entry);
            printWriter.println();
            
            // Close the file
            printWriter.close();
            
            System.out.println("Diary entry has been written to " + fileName + ".");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
