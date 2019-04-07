import java.util.*;
public class Word_count {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s,w="";
        int l,i;
        char ch;
        System.out.println("Enter the sentence: ");
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
}
}
