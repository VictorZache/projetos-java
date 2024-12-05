package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        scanner.close();

        double result;

        switch(operador) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        System.out.println(num1+" "+operador+" "+num2+": "+result);




    }
}
