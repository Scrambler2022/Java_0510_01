import java.util.Scanner;

public class _00_Class_07 {
    public static void main(String[] args) {
        
        // 랜덤숫자
        int random = (int)(Math.random()*3)+1; // 1,2,3
        int input = 0;
        Scanner scan =new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        input = scan.nextInt();
        if (input == random) {
            System.out.println("당첨");
        }else {
            System.out.println("꽝");
        }
        System.out.println("랜덤숫자 : "+random);
        System.out.println("일반숫자 : "+input);
        
        //System.out.println((int)(Math.random()*3)+1);
        
        
        
        
//        // 랜덤숫자 int
//        int random = 0;
//        random =  (int)(Math.random()*100); // 0~9.99999999999
//        System.out.println(random);
//        // 랜덤숫자 double
//        double random2 = 0;
//        random2 =  (Math.random()); // 0~9.99999999999
//        System.out.println(random2);
//        // 랜덤숫자 +1
//        int random3 = 0;
//        random3 =  (int)(Math.random()*10); // 0~9.99999999999
//        System.out.println(random3);
//
    }
}
