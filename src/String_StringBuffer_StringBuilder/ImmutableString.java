package String_StringBuffer_StringBuilder;

public class ImmutableString {
    /* Trường hợp 1: String là bất biến, không thể thay đổi*/
//    public static void main(String[] args) {
//        String s="Sachin";
//        s.concat(" Tendulkar"); //Nối Tendulkar vào sau Sachin
//        System.out.println(s); //Chỉ in ra Sachin bởi vì string là immutable object
//    }
//}

    /* Trường hợp 2:gán tham chiếu rõ ràng tới một object được tạo ra */
    public static void main(String[] args) {
        String s="Sachin";
        s=s.concat(" Tendulkar");
        System.out.println(s); //in ra Sachin Tendulkar
    }
}


