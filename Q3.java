import java.io.*;
import java.util.*;

public class DiaryAppender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for a new diary entry
        System.out.print("Enter your new diary entry: ");
        String newEntry = scanner.nextLine();
        
        // Get the current date and time
        Date currentDate = new Date();
        
        // Define the file name
        String fileName = "diary.txt";
        
        // Open the file in append mode
        try (FileWriter fileWriter = new FileWriter(fileName, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            
            // Append the current date and the new entry to the file
            printWriter.println("\nDate: " + currentDate);
            printWriter.println("Entry: " + newEntry);
            System.out.println("New diary entry has been appended to " + fileName + ".");
            
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file: " + e.getMessage());
        }
    }
}
