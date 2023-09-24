package ExceptionInJava.RuntimeExceptionDemo;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String text1 = " Hello Exception";
        int length = text1.length();
        System.out.println(" Length text1 = " + length);

        String text2 = getString();
        /*NullPointerException xảy ra tại đây, nó là ngoại lệ xuất hiện trong thời gian chạy
        * kiểu RuntimeException
        * Trình biên dịch compiler của Java không bắt buộc
        * Bạn phải bắt (catch) nó tại thời điểm biên dịch (compile time)*/
        // length = text2.length();

        // Kiểm tra để đảm bảo rằng text2 là khác null.
        // Thay vì sử dụng try-catch.
        if(text2 != null)
        {
            length = text2.length();
        }
        System.out.println("finish");
    }

    private static String getString() {
        if (1 == 2)
        {
            return "1 == 2";
        }
        return null;
    }
}
