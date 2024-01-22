package array;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students = new int[] {50,60,70,80,90};
        int sum = 0;

        for (int student : students) {
            sum += student;
        }
        double average = (double) sum / students.length;
        // 명시적 변환을 계속 해줘야 하는가? 양옆 항에?
        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
