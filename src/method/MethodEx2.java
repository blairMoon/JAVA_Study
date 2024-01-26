package method;

public class MethodEx2 {

    public static void main(String[] args) {
        String message = "Hello, world!";
        printHelloWorld(message,3);
        System.out.println("___________");

        printHelloWorld(message, 5);
        System.out.println("___________");
        printHelloWorld(message,7);




        }
    public static void printHelloWorld(String message , int num){


        for (int i = 0; i < num ; i++){
            System.out.println(message);

        }




    }
}
