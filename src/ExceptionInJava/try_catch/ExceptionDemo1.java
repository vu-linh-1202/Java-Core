package ExceptionInJava.try_catch;

public class ExceptionDemo1 {
    public static void main(String[] args) throws TooYoungException, TooOldException{
        int age = 50;
        AgeUtils.checkAge(age);
    }
}
