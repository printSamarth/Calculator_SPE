package Calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {

    private static final Logger logger = LogManager.getLogger(Calc.class);

    public Calc(){

    }

    public static void main(String[] args) {
        Calc calculator = new Calc();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("To find Natural log press 1.\nTo find square root press 2.\n"+
                    "To find Factorial press 3.\nTo find Power press 4.\nPress 5 to Exit.\n");
            System.out.println("Enter your choice:");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                System.out.println("Invalid input.");
                return;
            }

            double num;
            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter the number : ");
                        num = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                    System.out.println("Natural log is: " + calculator.naturalLog(num));
                    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                    break;
                case 2:
                    try {
                        System.out.print("Enter the number : ");
                        num = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                    System.out.println("Square root is: " + calculator.squareRoot(num));
                    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                    break;

                case 3:
                    try {
                        System.out.print("Enter the number : ");
                        num = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                    System.out.println("Factorial is: " + calculator.factorial(num));
                    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                    break;

                case 4:
                    double num1;
                    try {
                        System.out.print("Enter the first number : ");
                        num = scanner.nextDouble();
                        System.out.print("Enter the second number : ");
                        num1 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                    System.out.println("Power is: " + calculator.power(num, num1));
                    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                    break;
                default:
                    System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                    System.out.println("THANK YOU!");

                    return;
            }
        }

    }

    public double power(double num1, double num2) {
        double result;
        logger.info("Calculate power of " + num1 + " and " + num2);
        if(num1 == 0 && num2 == 0){
            result = Double.NaN;
        }
        else {
            result = Math.pow(num1, num2);
        }
        logger.info("Result of power operations is : " + result);
        return result;
    }

    public double naturalLog(double num) {
        double result = 0;
        try{
            logger.info("Calculate Natural log of " + num);
            if(num <= 0){
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN log of <= 0");
            }
            else{
                result = Math.log(num);
            }
        }
        catch(ArithmeticException err){
            logger.error("Number cannot be negative " + err.getMessage());
        }
        finally {
            logger.info("Result of naturalLog operation is : " + result);
        }
        return result;
    }

    public double factorial(double num) {
        double result = 1;
        try{
            logger.info("Calculate factorial of " + num);
            if(num < 0) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN factorial if < 0");
            }

            if(num == 0 || num == 1) return 1;

            for(int i = 1; i <= num; i++){
                result *= i;
            }
        }
        catch(ArithmeticException err) {
            logger.error("Number cannot be negative " + err.getMessage());
        }
        finally {
            logger.info("Result of factorial operation is: " + result);
        }

        return result;
    }

    public double squareRoot(double num) {
        double result = 0;
        try{
            logger.info("Calculate Square root  of number " + num);
            if(num < 0){
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN squareRoot of < 0");
            }
            else{
                result = Math.sqrt(num);

            }
        }catch(ArithmeticException err){
            logger.error("Number cannot be negative " + err.getMessage());
        }finally {
            logger.info("Result of squareRoot operation is : " + result);
        }

        return result;
    }
}