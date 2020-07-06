package unihealthmanagementsystem.oop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UniDReader {
    
    // Creating Instance
    private static UniDReader instance = null;
    public static UniDReader getInstance() {
        if(instance == null)
            instance = new UniDReader();
        return instance;
    }
    
    // Read Method
    public String Read(String dId, String file) {
        try {
            BufferedReader myReader = new BufferedReader(
                new FileReader("src\\unihealthmanagementsystem\\oop\\" + file + ".txt")
            );
            String str;
            while((str = myReader.readLine()) != null){
                String str1 = str.split(";")[0];
                if(str1.equals(dId)){
                    return str;
                }
            }
        } catch (IOException ex) {
            System.out.println(ex);
            return null;
        }
        return null;
    }
    
}
