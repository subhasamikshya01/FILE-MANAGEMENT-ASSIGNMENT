import java.io.*;

public class FileCopier {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            // Prompt the user for source file path
            System.out.print("Enter the source file path: ");
            String sourceFilePath = reader.readLine();

            // Prompt the user for destination file path
            System.out.print("Enter the destination file path: ");
            String destinationFilePath = reader.readLine();

            File sourceFile = new File(sourceFilePath);
            File destinationFile = new File(destinationFilePath);

            // Check if the source file exists
            if (!sourceFile.exists()) {
                System.out.println("Source file does not exist.");
                return;
            }

            // Check if the destination file already exists
            if (destinationFile.exists()) {
                System.out.print("Destination file already exists. Do you want to overwrite it? (y/n): ");
                String confirmation = reader.readLine();
                if (!confirmation.equalsIgnoreCase("y")) {
                    System.out.println("Operation canceled by user.");
                    return;
                }
            }

            // Copy the content from source file to destination file
            try (BufferedReader sourceReader = new BufferedReader(new FileReader(sourceFile));
                 BufferedWriter destinationWriter = new BufferedWriter(new FileWriter(destinationFile))) {
                String line;
                while ((line = sourceReader.readLine()) != null) {
                    destinationWriter.write(line);
                    destinationWriter.newLine();
                }
                System.out.println("Content copied from \"" + sourceFilePath + "\" to \"" + destinationFilePath + "\".");
            } catch (IOException e) {
                System.out.println("An error occurred while copying the content: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading user input: " + e.getMessage());
        }
    }
}
