import java.util.Scanner;

public class Ex3_4 {
    public static void main(String[] args) {
        //if else if else문 출력
        //if문 안에서 직접 출력방법
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if(score >= 90){
            System.out.println("등급 A");
        } else if(score >=80){
            System.out.println("등급 B");
        }else if(score >= 70){
            System.out.println("등급 C");
        }else{
            System.out.println("등급 D");
        }
    }
}
