package String_StringBuffer_StringBuilder;

/* Chương trình sau đây so sánh thời gian thực hiện đảo ngược 1 chuỗi dài thông qua
* String, StringBuilder and StringBuffer*/
public class StringBuilderStringBuffer {
    public static void main(String[] args)  {
        long beginTime;
        long elapsedTime;
        /*Build a long string*/
        String str ="";
        int size = 16536;
        char ch = 'a';
        int count;
        beginTime = System.nanoTime(); // Reference time in nanoseconds
        for(count = 0; count < size; ++count)
        {
            str += ch;
            ++ch;
            if(ch > 'z')
            {
                ch = 'a';
            }
        }
        elapsedTime = System.nanoTime()-beginTime;
        System.out.println("Elapased Time is: " + elapsedTime/1000 + "usecond (Build String)");

        /*Reserse a String by building another String character-by-character in the reverse order*/
        String strReverse = "";
        beginTime = System.nanoTime();
        int position;
        for(position = str.length() - 1; position >= 0; position--)
        {
            strReverse += str.charAt(position);
        }
        elapsedTime = System.nanoTime()-beginTime;
        System.out.println("Elapsed Time is " + elapsedTime/1000 + " usecond (Using String to reverse)");

        // Reverse a String via an empty StringBuffer by appending characters in the reverse order
        beginTime = System.nanoTime();
        int positions;
        StringBuffer stringBuffer = new StringBuffer(size);
        for(positions = str.length() - 1; positions >= 0; positions--)
        {
            stringBuffer.append(str.charAt(positions));
        }
        elapsedTime = System.nanoTime()-beginTime;
        System.out.println("Elapsed Time is " + elapsedTime/1000 + " usec (Using StringBuffer to reverse)");

        // Reverse a String by creating a StringBuffer with the given String and invoke its reverse()
        beginTime = System.nanoTime();
        StringBuffer sBufferReverseMethod = new StringBuffer(str);
        sBufferReverseMethod.reverse();     // use reverse() method
        elapsedTime = System.nanoTime() - beginTime;
        System.out.println("Elapsed Time is " + elapsedTime/1000 + " usec (Using StringBuffer's reverse() method)");

        // Reverse a String via an empty StringBuilder by appending characters in the reverse order
        beginTime = System.nanoTime();
        StringBuilder sBuilderReverse = new StringBuilder(size);
        for (int pos = str.length() - 1; pos >= 0 ; pos--) {
            sBuilderReverse.append(str.charAt(pos));
        }
        elapsedTime = System.nanoTime() - beginTime;
        System.out.println("Elapsed Time is " + elapsedTime/1000 + " usec (Using StringBuilder to reverse)");

        // Reverse a String by creating a StringBuilder with the given String and invoke its reverse()
        beginTime = System.nanoTime();
        StringBuffer sBuilderReverseMethod = new StringBuffer(str);
        sBuilderReverseMethod.reverse();
        elapsedTime = System.nanoTime() - beginTime;
        System.out.println("Elapsed Time is " + elapsedTime/1000 + " usec (Using StringBuidler's reverse() method)");
    }
}
