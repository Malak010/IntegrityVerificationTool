/*import java.io.*;  
public class FJava {  
    public static void main(String[] args) {  
  
    	//create a file 
        try {  
            File file = new File("javaFile.txt");  
            if (file.createNewFile()) {  
                System.out.println("New File is created!");  
            } else {  
                System.out.println("File already exists.");  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
  
    }  
}*/

import java.io.File;  
import java.io.IOException;  

public class FJava {
  public static void main(String[] args) {

    //Try catch block 
    try {
      
      //Creating a file with the name demofile.txt
      File myFile = new File("demofile.txt"); 

      if (myFile.createNewFile()) {
        System.out.println("The file is created with the name: " + myFile.getName());
      } else {
        System.out.println("The file already exists.");
      }
    } catch (IOException x) {
      System.out.println("An error is encountered.");
      x.printStackTrace();
    }
  }
}