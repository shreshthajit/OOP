
import java.io.File;

 
public class File_create {
    public static void main(String[] Args){
    File dir=new File("Input_Output");
    dir.mkdir();
    
    File file1=new File("C:/Users/ASUS/Desktop/Input_Output/Student.txt");
    File file2=new File("C:/Users/ASUS/Desktop/Input_Output/Hello.txt");
    try{
        file1.createNewFile();
        file2.createNewFile();
        System.out.println("Files are created");
    }catch(Exception e){
        System.out.println(e);
    }
    
    
    }
    
}
