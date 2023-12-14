import java.util.Scanner;
import java.time.*;
import java.util.HashMap;
public class New{
    public  static void main(String[]args){
        Scanner user=new Scanner(System.in);
        System.out.println("ENTER FIRSTNAME: ");
        int name=user.nextInt();
        System.out.println(name+" "+"welcome to marktday.com");
        LocalDate saii=LocalDate.now();
        System.out.println(saii);
        LocalTime masaa=LocalTime.now();
        System.out.println(masaa);
        HashMap <String,String> capital=new HashMap<String,String>();
        capital.put("kenya","Nairobi");
                capital.put("kenya","Nairobi");

        capital.put("kenya","Nairobi");

        capital.put("tanzani","arusha");

System.out.println(capital);
for(String i:capital.values()){
    System.out.println(i);
}
    }

}