
import java.io.*;

public class FileReaderApp{
    public static void main(String[] asrgs){

        String filePath = "HelloWorld.txt";
        try{
        if(!filePath.endsWith(".txt")){
            throw new InvalidFileFormatException("Invalid file type!");
        }
        File file = new File(filePath);
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String line;

        while((line = reader.readLine())!= null){
            System.out.println(line);
        }

    }
    catch(FileNotFoundException e){
    System.out.println("Error : "+e.getMessage());
    }
    catch(InvalidFileFormatException e){
        System.out.println("Error: "+e.getMessage());
    }
    catch(IOException e){
        System.out.println("Error : "+e.getMessage());
    }
}
}