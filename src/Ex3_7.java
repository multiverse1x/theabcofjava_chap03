import java.util.Scanner;

public class Ex3_7 {
    public static void main(String[] args) {

        //switch문 만들어보기

        System.out.println("현재 월을 입력하세요 >");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:              // 코드 길어져서 보통 옆으로 씀
                System.out.println("여름");
                break;
            case 9: case 10: case 11:
                System.out.println("가을");
                break;
            case 12: case 1: case 2:
                System.out.println("겨울");
                break;
            default:
                System.out.println("Error : 정확히 입력해주세요");
                //13이상을 적어도 겨울이라고 뜨니 case 12,1,2까지 만들고 default로 다른 값 입력되면 에러뜨게 만들기.
        }









    }
}
