package ExceptionInJava;

public class MethodCallStack {
    public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit main()");
    }

    private static void methodA() {
        System.out.println("Enter methodA()");
        methodB();
        System.out.println("Exit methodA()");
    }

    private static void methodB() {
        System.out.println("Enter methodA()");
        methodC();
        System.out.println("Exit methodA()");
    }

    private static void methodC() {
        System.out.println("Enter methodC()");
        //System.out.println(1/0); // divide-by-0 triggers an ArithmeticException
        System.out.println("Exit methodC()");
    }
}
