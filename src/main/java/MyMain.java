import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Hellloooo! What your name?");
        String name = scan.next();
        System.out.println("Glad to know you," + name);
        System.out.print("What's your favorite fruit?");
        String fruit = scan.next();
        System.out.println("I love " + fruit + " too!");

        scan.close();
    }
}
