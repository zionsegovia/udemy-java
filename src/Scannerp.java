import java.util.Scanner;

public class Scannerp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();


        System.out.println("You are "+age+ " years old!");
        System.out.println("Hello "+name);
        System.out.println("You like to eat "+food);
    }
}
