package loop;

public class WhileEx1 {
    public static void main(String[] args) {
        int numWhile = 0;
        int numFor = 0;
        while (numWhile < 10){
            numWhile++;
            System.out.println("while numWhile = " + numWhile);
        }
        for (int i=1;i <= 10;i++){
            numFor = i;
            System.out.println("numFor = " + numFor);
        }

    }
}
