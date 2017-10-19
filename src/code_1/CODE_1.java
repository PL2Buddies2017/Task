package code_1;
import java.io.*;


public class CODE_1{
   public static void main(String args[]) throws IOException{
        File newFile = new File("test_1.txt");
       FileWriter writer = new FileWriter(newFile,true);
       BufferedWriter buffer = new BufferedWriter(writer);
       PrintWriter pWriter = new PrintWriter(buffer);
       if (newFile.exists() == false)
       {
           newFile.createNewFile();
           System.out.println("Created");
       }
       else{
        System.out.println("Found");
       }
       pWriter.print("Hello World");
       pWriter.close();
       
   }
}//end of -code_1- 
/*
 Scanner input = new Scanner(System.in);
        File file = new File("test.txt");
        try (PrintWriter output = new PrintWriter(file)) {
            output.println("heloo lrafkjahf");
        }
      catch(IOException lol) {
          System.out.printf("ERROR : %s",lol);
       }
        try
        {
            Scanner input_2 = new Scanner(file);
            String name;
            name = input_2.nextLine();
            System.out.println(name);
        }
        catch(FileNotFoundException ex)
        {
          System.out.printf("ERROR : %s",ex);  
        }
*/