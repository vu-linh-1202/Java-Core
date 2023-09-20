package AbstractClassAndInterface.Interface;

// Interface này định nghĩa ra một tiêu chuẩn
// về những thứ có khả năng biết uống.
public interface CanDrink {

    // Các trường (field) trong Interface đều là 'public static final'.
    // Cho dù bạn có khai báo rõ hay không java luôn hiểu ngầm vậy.
    public static final String PEPSI = "PEPSI";
    final String NUMBER_ONE ="NUMBER_ONE";
    String SEVEN_UP ="SEVEN_UP";
    public void drink();
}
