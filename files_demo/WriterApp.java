import java.io.IOException;
import java.io.PrintWriter;

public class WriterApp {
    public static void main(String[] args) throws IOException {

        PrintWriter output = new PrintWriter("myotherfile.txt");
        output.println(100); //will write integer 100
        output.close();
    }
    
}
