// เรื่อง ตัวแปรและชนิดข้อมูล
public class Variable {
    public static void main(String[] args) {
        // นิยามตัวแปรแบบไม่ระบุค่าเริ่มต้น
        int number1;
        boolean status1;
        char alphabet1;
        float number2;
        double number3;

        // นิยามตัวแปรแบบระบุค่าเริ่มต้น
        int number10 = 10;
        float number11 = 20.5F;
        char alphabet2 = 'A';
        boolean status2 = true;

        // นิยามตัวแปรหลายบรรทัดในครั้งเดียว
        int a = 10, b = 20, c = 30;

        // การแสดงผลตัวแปร ต้องมีค่าถึงจะสามารถแสดงผลได้
        System.out.println("number10 มีค่า " + number10);
        System.out.println("number11 มีค่า " + number11);
        System.out.println("alphabet2 มีค่า " + alphabet2);
        System.out.println("status2 มีค่า " + status2);
        System.out.println("a มีค่า " + a);
        System.out.println("b มีค่า " + b);
        System.out.println("c " + c);


        /*แสดงผลได้ดังนี้
          number10 มีค่า 10
          number11 มีค่า 20.5
          alphabet2 มีค่า A
          status2 มีค่า true
          a มีค่า 10
          b มีค่า 20
          c 30
          * */
    }
}
