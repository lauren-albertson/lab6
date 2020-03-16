// code on rounding decimals from baeldung.com "How to Round a Number to N Decimal Places in Java"
import java.util.Scanner;

public class SciCalculator {
    public static void printMenu(double answer) { //Method for displaying menu
        System.out.println("Current Result: " + answer); //Current result is the result of the current operation
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("0. Exit Program");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Logarithm");
        System.out.println("7. Display Average"); //Display average is the average of total calculations across the total number of calculations
        System.out.print("Enter Menu Selection: ");
    }
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        double currentResult =  0.0, firstOperand, secondOperand, totalResult = 0.0;
        int menuSelection, numOperation = 0;

        printMenu(currentResult);
        menuSelection = keyboard.nextInt();

        if (menuSelection == 0) {
            System.out.println("Thanks for using this calculator. Goodbye!");
        }

        menuSelection = getMenuSelection(keyboard, menuSelection);

        while ((menuSelection > 0) && (menuSelection <= 7)) {
            switch (menuSelection) {
                case 1:

                    System.out.print("\nEnter first operand: ");
                    firstOperand = keyboard.nextDouble();
                    System.out.print("\nEnter second operand: ");
                    secondOperand = keyboard.nextDouble();

                    currentResult = firstOperand + secondOperand; //Addition
                    printMenu(currentResult);
                    menuSelection = keyboard.nextInt();

                    if (menuSelection == 0) {
                        System.out.println("Thanks for using this calculator. Goodbye!");
                    }

                    menuSelection = getMenuSelection(keyboard, menuSelection);

                    totalResult = currentResult + totalResult; //Sums result in background for case 7
                    numOperation++; //Sums number of operations for case 7

                    break;

                case 2:

                    System.out.print("\nEnter first operand: ");
                    firstOperand = keyboard.nextDouble();
                    System.out.print("\nEnter second operand: ");
                    secondOperand = keyboard.nextDouble();

                    currentResult = firstOperand - secondOperand; //Subtraction
                    printMenu(currentResult);
                    menuSelection = keyboard.nextInt();

                    if (menuSelection == 0) {
                        System.out.println("Thanks for using this calculator. Goodbye!");
                    }

                    menuSelection = getMenuSelection(keyboard, menuSelection);


                    totalResult = currentResult + totalResult;
                    numOperation++;

                    break;

                case 3:

                    System.out.print("\nEnter first operand: ");
                    firstOperand = keyboard.nextDouble();
                    System.out.print("\nEnter second operand: ");
                    secondOperand = keyboard.nextDouble();

                    currentResult = firstOperand * secondOperand; //Multiplication
                    printMenu(currentResult);
                    menuSelection = keyboard.nextInt();

                    if (menuSelection == 0) {
                        System.out.println("Thanks for using this calculator. Goodbye!");
                    }

                    menuSelection = getMenuSelection(keyboard, menuSelection);


                    totalResult = currentResult + totalResult;
                    numOperation++;

                    break;

                case 4:

                    System.out.print("\nEnter first operand: ");
                    firstOperand = keyboard.nextDouble();
                    System.out.print("\nEnter second operand: ");
                    secondOperand = keyboard.nextDouble();

                    currentResult = firstOperand / secondOperand; //Division
                    printMenu(currentResult);
                    menuSelection = keyboard.nextInt();

                    if (menuSelection == 0) {
                        System.out.println("Thanks for using this calculator. Goodbye!");
                    }

                    menuSelection = getMenuSelection(keyboard, menuSelection);

                    totalResult = currentResult + totalResult;
                    numOperation++;

                    break;

                case 5:

                    System.out.print("\nEnter first operand: ");
                    firstOperand = keyboard.nextDouble();
                    System.out.print("\nEnter second operand: ");
                    secondOperand = keyboard.nextDouble();

                    currentResult = Math.pow(firstOperand, secondOperand); //Exponentiation
                    printMenu(currentResult);
                    menuSelection = keyboard.nextInt();

                    if (menuSelection == 0) {
                        System.out.println("Thanks for using this calculator. Goodbye!");
                    }

                    menuSelection = getMenuSelection(keyboard, menuSelection);


                    totalResult = currentResult + totalResult;
                    numOperation++;

                    break;

                case 6:

                    System.out.print("\nEnter first operand: ");
                    firstOperand = keyboard.nextDouble();
                    System.out.print("\nEnter second operand: ");
                    secondOperand = keyboard.nextDouble();

                    currentResult = Math.log(secondOperand) / Math.log(firstOperand); //Logarithm
                    printMenu(currentResult);
                    menuSelection = keyboard.nextInt();

                    if (menuSelection == 0) {
                        System.out.println("Thanks for using this calculator. Goodbye!");
                    }

                    menuSelection = getMenuSelection(keyboard, menuSelection);

                    totalResult = currentResult + totalResult;
                    numOperation++;

                    break;

                case 7:
                    if (totalResult != 0.0) {
                        currentResult = totalResult / numOperation; //Average
                        System.out.printf("Sum of calculations: %.2f %n", totalResult); //Rounds to two decimal places
                        System.out.println("Number of calculations: " + numOperation);
                        System.out.printf("Average of calculations: %.2f %n", currentResult); //Rounds to two decimal places
                    }
                    else {
                        System.out.println("Error: No calculations yet to average!");
                    }
                    System.out.print("Enter Menu Selection: ");

                    menuSelection = keyboard.nextInt();

                    if (menuSelection == 0) {
                        System.out.println("Thanks for using this calculator. Goodbye!");
                    }

                    totalResult = currentResult + totalResult;
                    numOperation++;
                    break;
                default:
                    if (menuSelection == 0) {
                        System.out.println("Thanks for using this calculator. Goodbye!");
                    }

                    menuSelection = getMenuSelection(keyboard, menuSelection);
                    break;
            }

        }
    }

    public static int getMenuSelection(Scanner keyboard, int menuSelection) { //Method for error and exit calls
        if ((menuSelection > 7) || (menuSelection < 0)) {
            System.out.println("Error: Invalid selection!");
            System.out.print("Enter Menu Selection: ");
            menuSelection = keyboard.nextInt();
            if (menuSelection == 0) {
                System.out.println("Thanks for using this calculator. Goodbye!");
            }
        }
        return menuSelection;
    }
}
// comment for lab 6