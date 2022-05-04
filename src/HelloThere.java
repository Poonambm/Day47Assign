import java.util.Scanner;
public class HelloThere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there! How are you doing today?");
        String name = scanner.nextLine();
        System.out.println("Wow - Interesting! Tell me more!");
        String name1 = scanner.nextLine();
        System.out.println("Nice chatting with you! GoodBye!");
    }
}
