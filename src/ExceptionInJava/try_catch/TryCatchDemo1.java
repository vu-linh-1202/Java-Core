package ExceptionInJava.try_catch;

public class TryCatchDemo1 {
    public static void main(String[] args) {
        System.out.println("Start check");
        System.out.println("Check your age");
        int age = 50;
        try{
            AgeUtils.checkAge(age);
            System.out.println("Your pass!");
        }catch (TooYoungException e)
        {
            System.out.println("You are too young, not pass!");
            System.out.println(e.getMessage());
        }catch (TooOldException e)
        {
            System.out.println("You are too old, not pass!");
            System.out.println(e.getMessage());
        }
    }
}
