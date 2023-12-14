public class Hello{
    public static void main(String[]args){
        System.out.println("hello");
        Edu mokaya=new Edu();
        System.out.println(mokaya.name);
        String name="edwine";
        System.out.println("hello welcom "+name+"to london");
        byte number=100;
        System.out.println(number);
        System.out.println( name.indexOf("edwine"));
        int x=50;
        int y=60;
        System.out.println(y<x);
        if(x<y){
            System.out.println("you woon");
            
            String result=x>y?"am edine":"am ariel";
            System.out.println(result);
            int z=1;
            while(z<50){
                System.out.println(z);
                z++;
                String[] girfriends={
                    "asenath","doline","lillian","cynthia"
                };
                for(
                    String i  :girfriends
                ){
                    System.out.println(i);
                }
            }
        }
    }
}