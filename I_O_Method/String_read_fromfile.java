
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

 
public class String_read_fromfile {
    
     public static void main(String[] Args){
        try{
            File file=new File("C:/Users/ASUS/Desktop/Input_Output/Student.txt");
            
            Scanner sc=new Scanner(file);
            String s = null,w="";
             System.out.println(s);
             int l,i;
        char ch;
        s=sc.nextLine();
        s=s+ " ";
        l=s.length();
        System.out.println("Word\t Length");
        System.out.println("---------");
        for(i=0;i<l;i++){
            ch=s.charAt(i);
            if(ch!=' '){
                w=w+ch;
            }
            else{
                System.out.println(w + "\t" + w.length());
                w="";
                }
        }      
        }catch(FileNotFoundException e)
        {
            System.out.println(e);
            
        }
}
}
