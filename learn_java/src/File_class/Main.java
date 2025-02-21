package File_class;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Define the absolute file path
        String filePath = "C:/Users/hp/Desktop/learn_java/Secret_massage.txt";
        File file1 = new File(filePath);

        try {
            // Check if the file exists, create it if it doesn't
            if (file1.exists()) {
                System.out.println("The file exists");
            } else {
                System.out.println("The file doesn't exist");
                if (file1.createNewFile()) {
                    System.out.println("File created successfully.");
                } else {
                    System.out.println("Failed to create the file.");
                }
            }

            // Display file path information
            System.out.println("Path: " + file1.getPath());
            System.out.println("Absolute Path: " + file1.getAbsolutePath());

            // Write to the file
            FileWriter writer = new FileWriter(file1);
            writer.write("Randila Chathuranga");
            System.out.println("Message written to the file successfully.");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
