import java.util.Scanner;

public class _00_Class_05 {
    public static void main(String[] args) {
        
        // 90 점 이상이면 A, 그렇지 않으면 B , 70-c , 60-d , F
        // 97점 이상 A+ , 93점 이하 A-, 87점 이상 B+, 83이하 B-
        int a = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("점수를 입력해주세요");
        a = scan.nextInt();
    
        if (a >= 90) {
            if (a >= 97) {
                System.out.println("A+ 등급입니다.");
            } else if (a <= 93) {
                System.out.println("A- 등급입니다.");
            } else {
                System.out.println("A 등급입니다.");
            }
        } else if (a >= 80) {
            if (a >= 87) {
                System.out.println("B+ 등급입니다.");
            } else if (a <= 83) {
                System.out.println("B- 등급입니다.");
            } else {
                System.out.println("B 등급입니다.");
            }
        } else if (a >= 70) {
            if (a >= 75){
                System.out.println("C+ 등급입니다.");
            } else {
                System.out.println("C- 등급입니다.");
            }
        } else if (a >= 60) {
            System.out.println("D 등급입니다");
        } else {
            System.out.println("F 등급입니다.");
        }
    }
}