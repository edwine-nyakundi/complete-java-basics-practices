public class Try{
    public static void main(String[]args){
       try{
        int []number={1,2,3};
        
            System.out.println(number[1]);
        }
        catch(Exception e){
            System.out.println("something went wrong try again");
        }
        finally{
            System.out.println("try catch is finished");
        }
    }
}