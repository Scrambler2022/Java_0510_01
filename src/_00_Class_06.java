import java.util.Scanner;

public class _00_Class_06 {
    public static void main(String[] args) {
        
        // 1.변수선언 num1, num2, num3, op 2. scan 입력 3번 입력
        
        Scanner scan = new Scanner(System.in);
        int num1= 0, num2 = 0;
        char op = ' ';
        
        System.out.println("숫자를 입력하세요");
        num1 = scan.nextInt();
        System.out.println("숫자를 입력하세요");
        num2 = scan.nextInt();
        System.out.println("숫자를 입력하세요");
        op = scan.next().charAt(0);
        
        
        switch (op) {
            case '+':
                //result = num1 + num2;
                System.out.println("결과값 : "+("num1" + "num2"));
                break;
            case '-':
                //result = num1 + num2;
                System.out.println("결과값 : "+("num1" + "num2"));
                break;
            case '*':
                //result = num1 + num2;
                System.out.println("결과값 : "+("num1" + "num2"));
                break;
            case '/':
                //result = num1 + num2;
                System.out.println("결과값 : "+("num1" + "num2"));
                break;
            default:
                System.out.println("잘못된 입력값 입니다.");
                
        }
        
    }
}
