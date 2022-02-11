public class Ex3_1 {
    public static void main(String[] args) {

        int i=5, j=0;

        j = i++; // 후위형
        System.out.println("j=i++; 실행후, i=" + i + ", j=" + j);
        //먼저 출력후 ++
        //j=5, i=6


        i=5; // 비교하기 위해 다시 값 변경
        j=0;

        j = ++i;
        System.out.println("j=++i; 실행후, i=" + i + ", j=" + j);
        // ++된 후에 출력
        // i=6, j=6
    }
}
