import java.util.Scanner;

public class _00_Class_08 {
    public static void main(String[] args) {
        // 1. 변수선언 2.
        int n = 0;
        int sum = 0;
        Scanner scan =new Scanner(System.in);
        int i = 1;
        while (i <=10) {
            System.out.println(i+ "번째 숫자를 입력 하세요");
            n = scan.nextInt();
            sum = n + sum;
            
            i-=2;
        }
        System.out.println("여러번 더한 숫자의 합계는"+ sum+ "입니다.");
    
    
    
        // 숫자를 3번 반복해서 입력받아 , 합을 출력하시오.
        // 1.변수선언 num1 , num2 , num3 , sum // 2. scan 1번선언 // 3. 반복문
        // 4. 숫자 입력 넣어줌 // 5. sum 변수에 더하기 해줌. // 6. sum 을 출력
        
        //랜덤숫자 1- 100 까지의 랜덤숫자 1개를 출력하시오.
//        Scanner scan = new Scanner(System.in);
//        int random = 0;
//        random =  (int)(Math.random()*100);
//        //System.out.println("이번 주 행운의 숫자는"+"  " +random+"  " +"입니다 ");
//
//        //숫자 맞추기 프로그램
//        //10번
//        int i=1;
//        while (i<=10) {
//            System.out.println(i+"번째 숫자를 입력하세요.");
//            int input = scan.nextInt();
//            if(input==random) {
//                System.out.println("정답입니다.");
//                break;
//            }else if (input>random) {
//                System.out.println("오답입니다.");
//                System.out.println("입력한 숫자보다 작은 수입니다.");
//            }else if (input<random) {
//                System.out.println("오답입니다");
//                System.out.println("입력한 숫자보다 큰 수 입니다.");
//                }
//            else {
//                System.out.println("그 외입니다.");
//            }
//        i++;
//        }
//
//
//        for (int i = 1; i <101; i++) {
//        }
//        // 초기화
//        int i = 0;
//        while(i<10) {
//            System.out.println(i);
//            i++;
//        }
//        for (int i = 0 ; i <10; i++) {
//            System.out.println(i);
//        }
//

//        // i-- , i-=1, i=i-1
//        // i++ , i+=1, i=i+1
//        for (int i = 100; i > -20; i=i -7) {
//            System.out.println(i);
//        }
//
        // 00 01 022 03 04 .....09 11 ......99
//        for (int i = 0; i <10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.printf("%d%d = \n",i,j);
//            }
//            System.out.println();
//        }
        //Scanner scan = new Scanner(System.in);
    
//        for (int i = 0; i < 10 ; i++)
//            System.out.println(i);
//
        
//        for (int i = 2; i <=9; i++) {
//            System.out.printf("[ %d 구구비둘구단] \n ");
//            for(int j=1; j<=9; j++) {
//                System.out.printf("%d * %d = %d \n",i,j,i*i);
//            }
//            System.out.println();
//            //System.out.println(i+" * "+ i +" = " + (i*i));
//        }
        
        
//        int num = 0,  sum = 0;
//
//        for (int i = 0; i < 5; i++) { // 0번째 1번째 2번째 숫자를 입력하세요
//            System.out.println((i+1)+"번째 숫자를 입력해주세요");
//            num = scan.nextInt();
//            sum = sum += num;
//        }
//        System.out.println("합계 : "+sum);
//        System.out.println("입력받은 숫자의 합은" + sum + "입니다.");
//
        
        // 반복문 - for , while
//        int sum = 0;
//        int i = 1;
//        for(i =1;  i<=3;i++) {
//            sum += sum + i; // sum = sum + i;
//
//        }
//        System.out.println((i-1)+":"+sum);
        
        
        
    }
}
