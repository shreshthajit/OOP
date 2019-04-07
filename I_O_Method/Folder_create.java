
import java.io.File;

 
public class Folder_create {
    public static void main (String[] Args){
        File dir=new File("C:/Users/ASUS/Desktop/Input_Output");
        dir.mkdir();
        String dirlocation=dir.getAbsolutePath();
        System.out.println(dirlocation);
        System.out.println(dir.getName());
        
    }
    
}
