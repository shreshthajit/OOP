import java.io.File;
import java.util.Scanner;

public class Read_From_file {
    
    public static void main(String[] Args){
        try{
            File file=new File("C:/Users/ASUS/Desktop/Input_Output/Student.txt");
            
            Scanner sc=new Scanner(file);
            String s;
             s=sc.nextLine();
             System.out.println(s);
            
            
        }catch(Exception e){
            System.out.println(e);
            
        }
}
}
