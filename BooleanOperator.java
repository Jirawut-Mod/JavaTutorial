// เรื่องค่าการเปรียบเทียบ
import java.util.Scanner;
public class BooleanOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนตัวเลขที่ 1 = ");
        int a = sc.nextInt(); // รับข้อมูลตัวเลขจากแป้นพิมพ์ มาเก็บที่ตัวแปร a

        System.out.print("ป้อนตัวเลขที่ 2 = ");
        int b = sc.nextInt(); // รับข้อมูลตัวเลขจากแป้นพิมพ์ มาเก็บที่ตัวแปร b

        // วิเคราะห์จากตัวแสดงผล
        System.out.println( a + " มีค่าเท่ากับ "+ b +" เป็นจริงไหม = " + (a == b));
        System.out.println( a + " มีค่าไม่เท่ากับ "+ b +" เป็นจริงไหม = " + (a != b));
        System.out.println( a + " มีค่ามากกว่า "+ b +" เป็นจริงไหม = " + (a > b));
        System.out.println( a + " มีค่าน้อยกว่า "+ b +" เป็นจริงไหม = " + (a < b));
        System.out.println( a + " มีค่ามากกว่าเท่ากับ "+ b +" เป็นจริงไหม = " + (a >= b));
        System.out.println( a + " มีค่าน้อยกว่าเท่ากับ "+ b +" เป็นจริงไหม = " + (a <= b));

/*
ป้อนตัวเลขที่ 1 = 66
ป้อนตัวเลขที่ 2 = 124
66 มีค่าเท่ากับ 124 เป็นจริงไหม = false
66 มีค่าไม่เท่ากับ 124 เป็นจริงไหม = true
66 มีค่ามากกว่า 124 เป็นจริงไหม = false
66 มีค่าน้อยกว่า 124 เป็นจริงไหม = true
66 มีค่ามากกว่าเท่ากับ 124 เป็นจริงไหม = false
66 มีค่าน้อยกว่าเท่ากับ 124 เป็นจริงไหม = true
 */

    }
}
