import java.io.File;
import java.io.IOException;
import java.util.Date;

public class files {
    public static void main(String[] args) throws IOException {
        File sampl = new File("C:\\Testfiles\\vinayresume.txt");
        System.out.println(sampl.getParent());
        
        File sampl2 =new File(sampl.getParent() + "\\resume2.docx");
        sampl2.createNewFile();
          System.out.println(sampl.getName());
         if(sampl.exists())
         sampl.delete();
         sampl.createNewFile();
         System.out.println(sampl.exists());
         System.out.println(sampl.delete());
         System.out.println (sampl.createNewFile());
         System.out.println(sampl.isHidden());
         System.out.println(sampl.canWrite());
         sampl.setWritable(true);
         System.out.println(sampl.canWrite());
         System.out.println(sampl.getAbsolutePath());
         System.out.println(sampl.lastModified());
         System.out.println(new Date(sampl.lastModified()));
        
    }
    
}
