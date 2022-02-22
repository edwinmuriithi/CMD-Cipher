import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" What do you want to do?\n 1. Encode \n 2. Decode  \n 3. Quit");
        int choice = scanner.nextInt();
        scanner.nextLine(); //throw away the \n not consumed by nextInt()

        if(choice == 1)
        {
            System.out.println("Enter a text");
            String inputText = scanner.nextLine().toUpperCase();
            System.out.println("Enter a key ");
            int key = scanner.nextInt();
            Encoding encoding = new Encoding(inputText,key);
            System.out.println(String.format("Your encrypted text is:  %s",encoding.encode()));

        }
        else if(choice == 2)
        {
            System.out.println("Enter an encrypted text to decrypt");
            String inputText = scanner.nextLine().toUpperCase();
            System.out.println("Enter a key ");
            int key = scanner.nextInt();
            Decoding decoding = new Decoding(key, inputText);
            System.out.println(String.format("Your decrypted text is:  %s",decoding.decode()));
        }
        else if(choice == 3)
        {
            System.exit(0);
        }
        else
        {
            System.out.println("Input not known");
        }
    }
}