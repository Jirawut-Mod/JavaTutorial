// เรื่อง การรับ Input จากคีบอร์ด
import java.util.Scanner; //นำ Class Scanner เข้ามาทำงาน
public class Input {
    public static void main(String[] args) {
        /*
        รับค่าข้อมูล
        ข้อมูลแบบ ตัวเลข Integer, float, long, double, ข้อความ String

        */

        // ประกาศใช้งาน Class | new
        Scanner sc = new Scanner(System.in); // ประกาศใช้ Class Scanner ด้วยตัวแปร sc, System.in คือการรับค่าจากแป้นพิมพ์
        System.out.print("ป้อนสิ่งที่คุณอยากพิมพ์ = ");  // สร้างประโยคคำถาม
        String name = sc.nextLine(); // รับค่า String จากแป้นพิมพ์

        System.out.print("ป้อนอายุของคุณ = ");
        int year = Integer.parseInt(sc.nextLine());  //รับค่า Int จากแป้นพิมพ์

        int age = 2566 - year;

        System.out.println("สิ่งที่คุณอยากพิมพ์ = " + name); // แสดงข้อมูลที่พิมพ์
        System.out.println("ปีเกิด = " + year);
        System.out.println("อายุ = " + age);
    }
}
