import java.io.*;
public class CreateFile{
    public static void main(String []args){
        
        try{
             File hacking=new File("hack4.txt");
        if(hacking.createNewFile()){
            System.out.println("new file created "+ hacking.getName());
            FileWriter about=new FileWriter("myinfo.txt");
            about.write(123456789);
            about.close();
            System.out.println("successfuly wrote to teh file ");
        }
        else{
            System.out.println("sorry file was not created");
        }
        }catch(IOException  e){
            System.out.println("an error occured");
            e.printStackTrace();
         }
        
    }
}