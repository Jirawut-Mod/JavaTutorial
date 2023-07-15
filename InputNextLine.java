import java.util.Scanner;
public class InputNextLine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนชื่อของคุณ = ");

        String name = sc.nextLine();  // อ่านข้อความที่รับจากแป้นพิมพ์ทั้งบรรทัด
        System.out.println("ชื่อของคุณคือ = " + name);

        System.out.print("ป้อนสิ่งพิเศษของคุณ = ");
        String name2 = sc.next();  // อ่านข้อความที่รับจากแป้นพิมพ์ แต่ไม่อ่านตั้งที่ค่าที่เว้นวรรคเป็นต้นไป
        System.out.println("สิ่งพิเศษของคุณ = " + name2);

                // แสดงผล
//                ป้อนชื่อของคุณ = มด อนาคตดี
//                ชื่อของคุณคือ = มด อนาคตดี
//                ป้อนสิ่งพิเศษของคุณ = ผมว่า ผมหล่อ
//                สิ่งพิเศษของคุณ = ผมว่า
    }
}
