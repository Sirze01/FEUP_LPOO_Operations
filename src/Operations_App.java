import java.util.Scanner;

public class Operations_App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result;
        switch (operation) {
            case "sum":
                result = a + b;
                break;
            case "sub":
                result = a - b;
                break;
            case "mul":
                result = a * b;
                break;
            case "div":
                result = a / b;
                break;
            default:
                throw new RuntimeException("unknown operation");
        }

        System.out.println(result);
    }
}
