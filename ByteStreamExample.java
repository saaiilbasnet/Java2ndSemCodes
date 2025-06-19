import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample{
    
    public static void main(String[] args){
        try( FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("destination.txt")){

                byte[] buffer = new byte[1024];
                int byteRead;

                while((byteRead = fis.read(buffer)) != -1){
                    fos.write(buffer,0,byteRead);
                    break;
                }

        }catch(IOException e){
            System.err.println("Error copying file! : "+e.getMessage());
        }
    }
}