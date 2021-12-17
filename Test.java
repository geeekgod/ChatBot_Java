import java.util.*;
import java.io.*;

class Test {

    static void appopener(String input) {
        Runtime runtime = Runtime.getRuntime();

        try {
            runtime.exec(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            str = str.toLowerCase();

            switch (str) {
                case "hello":
                case "hey":
                case "hi":
                case "hie":
                case "hola":
                    System.out.println("Hello!");
                    break;
                case "how are you":
                    System.out.println("I'm fine!");
                    break;
                case "addtion of numbers":
                case "addtion of number":
                case "add numbers":
                case "add":
                    System.out.println("Okay\nEnter the two numbers");
                    Integer a1 = sc.nextInt();
                    Integer a2 = sc.nextInt();
                    Integer ans1 = a1 + a2;
                    System.out.println("The addition is:" + ans1);
                    break;
                case "exit":
                case "quit":
                case "close":
                case "shut down":
                    System.out.println("Byee !!");
                    java.lang.System.exit(0);
                    break;

                case "run":
                case "run apps":
                case "run app":
                case "start apps":
                case "start app":
                    System.out.println("Enter the name of app:");
                    String appName = sc.nextLine();
                    appopener(appName);
                    break;

                default:
                    System.out.println("Sorry i didnt got that one!");
                    break;
            }
        }
    }

}