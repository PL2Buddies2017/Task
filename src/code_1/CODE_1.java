package code_1;
 
import java.io.*;
import java.util.Scanner;


public class CODE_1{
   public static void main(String args[])throws IOException{
   System.out.println("1 - remove post\n2 - delete friend");
   File_1 z = new File_1("Friend.txt");
   int cho;
   Scanner input = new Scanner(System.in);
   cho = input.nextInt();
   
   switch (cho)
   {
       case 1:System.out.println("Not availble now");break;
       case 2:int x =z.LINES();
       System.out.println("\n\nwrite Id of Friend to delete it");
       int FRI = 0 ;
       while(true)
        {
            FRI  = input.nextInt();
            if(x>=FRI){break;}
            System.out.println("record not found\ntry again");
        }
        z.copyEdit(FRI);
       break;
   }
   
   }
   
}//end of -code_1- 
