import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner firstValue = new Scanner(System.in);
        System.out.println("Enter first value");

        String value1 = firstValue.nextLine();

        Scanner secondValue = new Scanner(System.in);
        System.out.println("Enter second value");

        String value2 = secondValue.nextLine();

        Scanner operatorObj = new Scanner(System.in);
        System.out.println("Enter operator (+ - / *)");

        String operator = operatorObj.nextLine();

        switch (operator) {
            case "+":
                System.out.println("======================");
                System.out.println(Float.parseFloat(value1) + Float.parseFloat(value2));
                break;
            case "-":
                System.out.println("======================");
                System.out.println(Float.parseFloat(value1) - Float.parseFloat(value2));
                break;
            case "/":
                System.out.println("======================");
                System.out.println(Float.parseFloat(value1) / Float.parseFloat(value2));
                break;
            case "*":
                System.out.println("======================");
                System.out.println(Float.parseFloat(value1) * Float.parseFloat(value2));
                break;
            default:
                System.out.println("Wrong character (" + operator + ")");
        }
    }
}
