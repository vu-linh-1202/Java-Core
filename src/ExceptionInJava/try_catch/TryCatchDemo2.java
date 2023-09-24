package ExceptionInJava.try_catch;

public class TryCatchDemo2 {
    public static void main(String[] args) {
        System.out.println("Start check");
        System.out.println("Check your age");
        int age = 50;
        try {
            // chỗ này có thể gây ra ngoại lệ TooOldException
            // hoặc TooYoungExfeption
            AgeUtils.checkAge(age);
            System.out.println("Your pass!");
        }
        catch (TooYoungException | TooOldException e)
        {
            // Bắt nhiều ngoại lệ trong 1 khối catch
            System.out.println("Your age valid, you not pass!");
            System.out.println(e.getMessage());
        }
    }
}
