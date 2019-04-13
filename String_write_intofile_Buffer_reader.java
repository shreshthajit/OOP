 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


class A_3{
    
public static void main(String[] args) throws IOException{

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    BufferedWriter out = new BufferedWriter(new FileWriter("C:/Users/ASUS/Desktop/AB/jisnu"));
    try {
        String inputLine = null;
        do {
            inputLine=in.readLine();
            out.write(inputLine);
            out.newLine();
        } while (!inputLine.equalsIgnoreCase("eof"));
        System.out.print("Write Successful");
    } catch(IOException e1) {
        System.out.println("Error during reading/writing");
    } finally {
        out.close();
        in.close();
    }
}
}