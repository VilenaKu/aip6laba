import java.io.*;
import java.util.Scanner;

public class Var7 {
   public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        PrintWriter out=null;
        br = new BufferedReader(new InputStreamReader(new FileInputStream("file.txt"),"cp1251"));
        out = new PrintWriter("result.txt","cp1251");
        int lineCount = 0;
        String s;
        while ((s = br.readLine()) != null){
            lineCount++;
            int wordCount=0;
            String []parts=s.split(" ");
            out.print(lineCount + ": ");
            for(int i=0;i<parts.length;i++)
                if(parts[i].charAt(0)==parts[i].charAt(parts[i].length()-1)){
                    out.print(parts[i]+" ");
                    wordCount++;
                }
            out.println("Количество выбранных слов: "+wordCount);
        }
        br.close();
        out.flush();
        out.close();
    }
}