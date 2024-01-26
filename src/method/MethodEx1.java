package method;

public class MethodEx1 {
    public static void main(String[] args) {
       double average =  add(1 ,2,3);
       System.out.println("평균값: " + average);
      average = add(15,25,35);
      System.out.println("평균값: " + average);
    }

    public static double add(int a ,int b,int c ) {

      return (double) ( a + b +c) / 3;

    }

}
