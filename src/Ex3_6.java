import java.util.Scanner;

public class Ex3_6 {
    public static void main(String[] args) {

        int score = 0;
        char grade = ' ', opt = '0';

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        System.out.printf("당신의 점수는 %d 입니다. %n", score);

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            } else if (score >= 80) {
                grade = 'B';
            }if (score >= 87) {
                    opt = '+';
                } else if (score < 84) {
                    opt = '-';
                }
            } else {
                grade = 'C';
            }
        System.out.printf("등급은 %c%c.%n",grade, opt);
        }


    }

