import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับคะแนนจากผู้ใช้
        System.out.print("โปรดป้อนคะแนนของคุณ: ");
        int score = scanner.nextInt();

        // ตัดเกรดโดยใช้ฟังก์ชัน calculateGrade
        char grade = calculateGrade(score);

        // แสดงผลลัพธ์
        System.out.println("เกรดของคุณคือ: " + grade);

        scanner.close();
    }

    // ฟังก์ชันสำหรับการคำนวณเกรด
    public static char calculateGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}




//    switch (Menu) {
//                    case 1:
//                        System.out.println(arraystring[0]);
//                        break;
//                    case 2:
//                        System.out.println(arraystring[1]);
//                        break;
//                    case 3:
//                        System.out.println(arraystring[2]);
//                        break;
//                    case 4:
//                        System.out.println(arraystring[3]);
//                        break;
//                    case 5:
//                        System.out.println(arraystring[4]);
//                        break;
