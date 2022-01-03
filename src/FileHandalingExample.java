import java.io.File;
import java.io.IOException;

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
}
