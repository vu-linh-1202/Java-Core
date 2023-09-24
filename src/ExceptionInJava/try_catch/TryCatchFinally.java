package ExceptionInJava.try_catch;

public class TryCatchFinally {
    public static void main(String[] args) {
        String text = "001234A2";
        int value = toInteger(text);
        System.out.println("Value = " + value);
    }

    private static int toInteger(String text) {
        try{
            System.out.println("Begin parse text: "+ text);
            // tại đây có thể gây ra ngoại lệ NumberFormatException
            int value = Integer.parseInt(text);
            return value;
        }
        catch (NumberFormatException e)
        {
            // trong trường hợp text không phải là một số
            // khối catch này sẽ được thực thi
            System.out.println("Number format exception " + e.getMessage());
            // khi NumberFormatException xảy ra lỗi, trẻ về  0
            return 0;
        }
        finally {
            System.out.println("End parse text: "+ text);
        }
    }
}
