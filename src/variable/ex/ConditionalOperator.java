package variable.ex;

public class ConditionalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int max = (b - a) > 0 ? b :a;
        System.out.println("더 큰 숫자는 " + max +"입니다.");
    }
}
