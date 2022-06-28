import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PracticeMain {
    static String directory = "data";
    static String fileName = "contacts.txt";
    static Path dataDirectory = Paths.get(directory);
    static Path dataFile = Paths.get(directory,fileName);
    private static List<PracticeContact> contactList;

    //    static Files.write(dataFile)
    public static void main(String[] args) throws IOException {
        createFileAndDirectory();
        writeFile();
        readFile();
    }

    ///create Files and Directories
    public static void createFileAndDirectory() throws IOException {
        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }
        if (!Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }
    }

    public static void readFile() throws IOException {
        List<String> readContactList = Files.readAllLines(dataFile);

        for (int i = 0; i < readContactList.size(); i += 1) {
            System.out.println((i + 1) + ": " + readContactList.get(i));
        }
    }

    public static void writeFile() throws IOException {
        List<String> contactsList = Arrays.asList("coffee", "milk", "sugar");
        Path filepath = Paths.get("data","contacts.txt");
        Files.write(filepath,);
    }




}//end of class

//    public static void writeFile () {
//        Files.write(dataDirectory, List<String> lines[, StandardOpenOption option])
//    }
//}