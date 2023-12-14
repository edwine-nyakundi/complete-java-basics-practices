public class Throw{
    static void checkAge(int age){
        if(age<25){
            throw new ArithmeticException("still young to marry");
        }
        else{
            System.out.println("you are supposed to marry buddy");
        }

    }
    public static void main(String []args){
        checkAge(26);
    }
}