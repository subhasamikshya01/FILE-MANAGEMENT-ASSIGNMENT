import java.io.*;

public class DiaryReader {
    public static void main(String[] args) {
        // Define the file name
        String fileName = "diary.txt";
        
        try {
            // Open the file for reading
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("The file \"" + fileName + "\" does not exist.");
                return;
            }
            
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            // Read and display the content of the file
            String line;
            System.out.println("Content of \"" + fileName + "\":");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            
            // Close the file
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
