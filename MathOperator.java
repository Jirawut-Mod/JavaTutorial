// เรื่องตัวดำเนินการ
import java.util.Scanner;
public class MathOperator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนตัวเลขแรก = ");
        int a = sc.nextInt(); // รับข้อมูลตัวเลขจากแป้นพิมพ์ มาเก็บที่ตัวแปร a

        System.out.print("ป้อนตัวเลขดำเนินการ = ");
        int b = sc.nextInt(); // รับข้อมูลตัวเลขจากแป้นพิมพ์ มาเก็บที่ตัวแปร b


        // คำนวณจากตัวแสดงผล
        System.out.println("ผลบวก = " + (a + b)); // บวก
        System.out.println("ผลลบ = " + (a - b)); // ลบ
        System.out.println("ผลคูณ = " + (a * b)); // คูณ
        System.out.println("ผลหาร = " + (a / b)); // หาร

        /* แสดงผล
            ป้อนตัวเลขแรก = 134
            ป้อนตัวเลขดำเนินการ = 32
            ผลบวก = 166
            ผลลบ = 102
            ผลคูณ = 4288
            ผลหาร = 4
         */
    }
}
