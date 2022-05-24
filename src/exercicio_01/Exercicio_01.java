package exercicio_01;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator addition = new Calculator(new Addition());
        Calculator subtraction = new Calculator(new Subtraction());
        Calculator multiplication = new Calculator(new Multiplication());
        Calculator division = new Calculator(new Division());

        Boolean leave = false;

        while (!leave){
            System.out.println("*** ESCOLHA A OPERAÇÃO DESEJADA ***");
            System.out.println("(0) - Sair");
            System.out.println("(1) - Adição");
            System.out.println("(2) - Subtração");
            System.out.println("(3) - Multiplicação");
            System.out.println("(4) - Divisão");
            System.out.printf(": ");
            int choice = scanner.nextInt();
            double numberOne = 0.0;
            double numberTwo = 0.0;
            if ( choice > 0 && choice < 5 ){
                System.out.printf("Número 1: ");
                numberOne = scanner.nextDouble();
                System.out.printf("Número 2: ");
                numberTwo = scanner.nextDouble();
            }

            Double result = null;
            MathOperations mathOperation = MathOperations.ABSENT;

            switch (choice){
                case 0:
                    leave = true;
                    break;
                case 1:
                    result = addition.processCalculation(numberOne, numberTwo);
                    mathOperation = MathOperations.ADDITION;
                    break;
                case 2:
                    result = subtraction.processCalculation(numberOne, numberTwo);
                    mathOperation = MathOperations.SUBTRACION;
                    break;
                case 3:
                    result = multiplication.processCalculation(numberOne, numberTwo);
                    mathOperation = MathOperations.MULTIPLICATION;
                    break;
                case 4:
                    result = division.processCalculation(numberOne, numberTwo);
                    mathOperation = MathOperations.DIVISION;
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
            if (result != null) {
                System.out.printf("\n %.2f %s %.2f = %.2f \n", numberOne, mathOperation.getSymbol(), numberTwo, result);
                System.out.print("Pressione ENTER...");
                scanner.nextLine();
                scanner.nextLine();
            }
        }



    }
}
