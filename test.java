import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our app!");
        System.out.print("Please enter your username: ");
        String userName = scanner.nextLine();
        System.out.print("Please enter your password: ");
        String password = scanner.nextLine();

        if (userName.equals("kullanici") && password.equals("123java")) {
            System.out.println("Login successful!");
        } else if (userName.equals("kullanici") && !password.equals("123java")) {
            System.out.println("password is not valid");
            System.out.println("do you want to reset password? if yes choose 1, if no choose 2");
            int choose = scanner.nextInt();
            scanner.nextLine();
            if (choose == 1) {
                System.out.print("enter your new password: ");
                String pass2 = scanner.nextLine();
                if (pass2.equals("123java")) {
                    System.out.println("The password could not be created, please enter another password.");
                } else {
                    System.out.println("the new password created");
                }
            }
        } else if (!userName.equals("kullanici") && password.equals("123java")) {
            System.out.println("username is not valid");
        } else if (!userName.equals("kullanici") && !password.equals("123java")) {
            System.out.println("password and username are not valid. Try again");
        }
    }
}