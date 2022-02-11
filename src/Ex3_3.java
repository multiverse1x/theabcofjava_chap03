public class Ex3_3 {
    public static void main(String[] args) {


        //반올림 메서드 Math.round > 소수점 첫번째 자리에서 반올림

        double pi = 3.141592;
        System.out.println(Math.round(pi));
        System.out.println("-------");

        // 소수점 첫번째 자리가 아닌 다른자리에서 반올림하고싶은 경우 자리수만큼 해당값 곱하고 반올림 후에 다시 나눔
        // 소수점 네번째에서 반올림 하고싶은 경우

        System.out.println(pi);
        System.out.println(pi*1000);
        System.out.println(Math.round(pi*1000));
        System.out.println(Math.round(pi*1000) / (double)1000);// 주의할점은 나눌때 int타입으로 나누면 안됨. double붙여주자.
        System.out.println(Math.round(pi*1000) / 1000.0);

        // 3.141을 얻으려면
        System.out.println();
        System.out.println("----------");
        System.out.println(pi);
        System.out.println(pi*1000);
        System.out.println((int)(pi*1000)); // int타입으로 형변환시켜 소수점을 잘라버린다.(값손실)
        System.out.println((int)(pi*1000) / 1000.0);



        //조건연산자 써보기
        int score = 80;
        String result = (score > 60) ? "합격" : "땡";
        System.out.println(result);


    }
}
