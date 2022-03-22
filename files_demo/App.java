import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {

        List<String> dataList = new ArrayList<String>(); //variable length array
        FileReader fileReader = new FileReader("myfile.txt");
        BufferedReader buffer = new BufferedReader(fileReader);
        String line;

        while ((line = buffer.readLine()) != null){
            dataList.add(line);
            System.out.println(line);
        }

        fileReader.close();
        buffer.close();
    }
}

