 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class  String_I_O {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:/Users/ASUS/Desktop/Input_Output/Student.txt"));
            String s;
            String[] words = null;
            int count = 1;
            while((s = br.readLine()) != null) {
                words = s.split(" ");
                for(int i=0; i<words.length; i++) {
                    if(words[i].equals("")) continue;
                    for(int j=i+1; j<words.length; j++) {
                        if(words[i].equals(words[j])) {
                            words[j] = "";
                            count++;
                        }
                    }
                    System.out.println("'" + words[i] + "'" + " is " + count + " times.");
                    words[i] = "";
                    count = 1;
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
 
