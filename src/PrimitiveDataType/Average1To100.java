package PrimitiveDataType;

public class Average1To100 {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        int number;
        for (number = 1; number <= 100; number++)
        {
            sum += number;
        }
        /*
        * average = sum / 100;
        * average =(double)(sum/100);
        * // ----> Average = 50,0: Incorrect. Beacause both the sum and 100 are int. The result of int/int is a int.
        // sau đó được chuyển ngầm sang double và gán cho double biến average.
        * */

        // Để có kết quả chính xác, cần thực hiện một trong các cách sau:
        average = (double) sum / 100; // Cast sum from int to double before division, double / int -> double / double -> double
        average = sum / (double)100; // Cast 100 from int to double before division, int / double -> double / double -> double
        average = sum /100.0; // int / double -> double / double -> double
        System.out.println("Average is "+ average);
    }
}
