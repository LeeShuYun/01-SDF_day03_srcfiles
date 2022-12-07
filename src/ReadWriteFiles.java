import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadWriteFiles {

    //read writing files . these will read until EoF End of file 

    public static void main(String[] args){
        String filePath = "src/demo.txt";
        ReadFile(filePath);
        String writePath = "src/output.txt";
        writeFile(writePath);
    }
    
    public static void ReadFile(String fname){
        //path obj
        Path path = Paths.get(fname);
        
        //file obj
        File fobj = path.toFile();

        if (fobj.exists()) {
            System.out.println("File exists");
        }else{
            System.out.println("File Not found");
        }

        //reader
        try{
            FileReader fr = new FileReader(fobj);
            BufferedReader bdf = new BufferedReader(fr);

            //this reads only one line
            String line = bdf.readLine();
            System.out.println("First line => " + line);
            
            // line = bdf.readLine();
            // System.out.println("Second line => " + line);

            //this checks that there's a next line so that our prog can keep reading the next line/
            //the end of a file will read as null
            //reads line by line until there's nothing next
            while (null != (line = bdf.readLine())){
                System.out.println("> " + line);
            }

            //this is here instead of finally{} because it would be exposed to the above scope
            bdf.close();
        }
        catch (FileNotFoundException e){
            //gets the exception default details and also adds on our own custom lines
            System.out.println("File not found. Please check input file: " + e.getMessage());
        }
        catch (IOException e){
            System.out.println("Unable to read line: " + e.getMessage());
        }

        //consume the content
    }

    
    public static void writeFile(String fname){
        try{
        FileWriter fw = new FileWriter(fname, false); //this toggles between append and write mode
        //testing out Buffered Writer
        BufferedWriter bfw = new BufferedWriter(fw);
        bfw.write("apples");
        bfw.write("oranges");
        bfw.write("pears");
        
        //these add a line each , but there's no line break unless you add \n because FileWriter doesn't do i
        // fw.write("apple \n");
        // fw.write("orange \n");
        // fw.write("pear \n");
        // //this will clean up and close
        // fw.flush();
        // fw.close();
        }
        catch (IOException e) {
            System.out.println("Unable to write line: " + e.getMessage());
        }

    }
}
