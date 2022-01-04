import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandalingExample {

    void onCreateFile(){
        File file=new File("example.txt");
        try {
            if(file.createNewFile()){
                System.out.println(file.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void writeDataToFile(){
        try {
            FileWriter fileWriter=new FileWriter("example.txt");
            fileWriter.write("I am good boy");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void readContentFromFile(){
        File file=new File("example.txt");
        try {
            Scanner readFile=new Scanner(file);
            while (readFile.hasNextLine()){
                String fileContent=readFile.nextLine();
                System.out.println(fileContent);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
    void deleteFile(){
        File file=new File("example.txt");
        if(file.delete()){
            System.out.println(file.getName()+"is Deleted");
        }
    }
}
