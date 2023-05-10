import java.util.Scanner;

public class _00_Class_02 {
    public static void main(String[] args) {
        
        // m,f를 입력 받아 m이면 남자입니다. f이면 여자입니다. 출력하시오.
        String input = " ";
        Scanner scan = new Scanner(System.in);
        System.out.println("성별을 입력하세요");
        input = scan.next();
        if (input.equals('m') || input.equals('M')) {
            System.out.println("남성분입니다");
        }
        else if (input.equals('f') || input.equals('F')) {
            System.out.println("여성분입니다.");
        } else {
            System.out.println("잘못 입력하였습니다. 다시 입력하세요");
            
            
            
        }
    }
}
        
        
        // 입력한 숫자가 1,6,9만 입력받아 1,6,9 출력하시오.
        // if () else if () else // 자바에서는 리스트가 없고 객체와 배열이 있다.
//        int num2 = 0;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("숫자를 입력하세요");
//        num2 = scan.nextInt();
//        if (num2 == 1) {
//            System.out.println("1입니다.");
//        } else if (num2 == 6){
//            System.out.println("6입니다.");
//        } else {
//            System.out.println("9입니다.");
//        }
        
        
//        // 점수를 입력받아 60점 이상이면 합격, 60점 미만이면 불합격을 출력하시오.
//        int b = 60;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("점수를 입력하세요");
//        b = scan.nextInt();
//        if (b >= 60) {
//            System.out.println("합격");
//        } else {
//            System.out.println("불합격");
//        }
    
        
        // 입력한 숫자가 2의 배수이면 2의 배수입니다. 2의 배수가 아닙니다.
        // 1. 변수선언 2. scan 입력 한후 변수입력받음  3.비교 4.출력
        /*int a = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("정수 int를 입력해주세요");
        a = scan.nextInt();
        if(a%2==0) {
            System.out.println("2의 배수 입니다.");
        }else {
            System.out.println("2의 배수가  아입니다.");
        }*/
        
        
//        int num = 1;
//
//        //if 문만
//        if(num==0) {
//            System.out.println("0입니다");
//        }
        
        
        // if, else if, else
//        if(num>0) {
//            System.out.println("양수 입니다.");
//        } else if(num==0){
//            System.out.println("0 입니다.");
//        }else {
//            System.out.println("음수 입니다.");
//        }
//
        
        
        //        int num = 8;
//        (num >= 1)?" ":" "; //  삼항 연산자
//        if(num ==8) {
//            System.out.println("8입니다.");
//        } else {
//            System.out.println("8이 아닙니다.");