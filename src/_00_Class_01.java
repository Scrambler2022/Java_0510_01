import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import java.util.logging.Logger;
import java.util.Scanner;

public class _00_Class_01 {
    
    public static void main(String[] args) {
        // 1.변수선언 2. scan 입력 3. print 출력
        //입력한 글자가 문자인지 파악하는 프로그램
        // 1. 변수선언 2. scan 입력 3. 비교 4. print 출력
        char input2 = ' ';
        Scanner scan = new Scanner(System.in);
        System.out.println("글자글자 입력 꾸루꾸루");
        input2 = scan.next().charAt(0);
        String result = ((input2 >= 'a' &&input2 <= 'z')||(input2 >= 'A' &&input2 <= 'Z'))? "입력한 글자 문자 ":"입력한 글자 영문자가 아닙니다. ";
        System.out.println(result);



//        char input = ' ';
//        Scanner scan = new Scanner(System.in);
//        System.out.println("문자를 입력하세요");
//        input = scan.next().charAt(0);
//        System.out.println("결과값 :" + input);
    
        
        
    }
}