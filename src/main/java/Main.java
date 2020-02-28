import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceDirPath = null;
        String destinationDirPath = null;
        try {
            System.out.println("Enter the name of source directory: ");
            sourceDirPath = reader.readLine();
            System.out.println("Enter the name of destination directory: ");
            destinationDirPath = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Wrong entry.");
        }

        try {
            File sourceDir = new File(sourceDirPath);
            File destinationDir = new File(destinationDirPath);

            FileUtils.copyDirectory(sourceDir, destinationDir);
            System.out.println("It's done!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong.");
        }
    }
}
