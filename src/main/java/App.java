import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" What do you want to do?\n 1. Encode \n 2. Decode  \n 3. Quit");
        int choice = scanner.nextInt();
        scanner.nextLine(); //throw away the \n not consumed by nextInt()


    }
}