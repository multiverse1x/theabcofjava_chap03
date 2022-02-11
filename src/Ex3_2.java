public class Ex3_2 {
    public static void main(String[] args) {

        //오버플로우 발생

        int a = 1000000;
        int b = 2000000;

        long c = a * b; // int타입의 최대값을 넘어서 오버플로우 발생 ( a*b 먼저 연산됨(int타입으로))
        System.out.println(c);

        long d = (long)a * b; // a나 b중 아무거나 형변환 먼저 해줌
        System.out.println(d);
    }
}
