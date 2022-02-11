import java.util.Scanner;


public class Ex3_5 {
    public static void main(String[] args) {

        int score = 0;
        char grade = ' ';

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();


        if(score >= 90){
            grade = 'A';
        } else if(score >=80){
            grade = 'B';
        } else if(score >= 70){
            grade = 'C';
        }else{                          //else부분을 생략하고 grade에 D를 줘버려도 됨.
            grade = 'D';
        }
        System.out.println("등급은 " + grade + "입니다.");
    }
}
