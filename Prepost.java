// เรื่องตัวดำเนินการทางตรรก
import java.util.Scanner;
public class Prepost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // pre หน้า | post หลัง

        // a
        System.out.print("ป้อนตัวเลขที่ 1 = ");
        int a = sc.nextInt();
        System.out.print(" ค่าเริ่มต้นที่กำหนดคือ = ");
        System.out.println(a);

        System.out.print(++a);
        System.out.print(" ผลลัพท์บวกหน้าของ pre = ");
        System.out.println(a);

        System.out.print(a++);
        System.out.print(" ผลลัพท์บวกหลังของ post = ");
        System.out.println(a);

        System.out.print(--a);
        System.out.print(" ผลลัพท์ลบหน้าของ pre = ");
        System.out.println(a);

        System.out.print(a--);
        System.out.print(" ผลลัพท์บวกหลังของ post = ");
        System.out.println(a);
    }
}
