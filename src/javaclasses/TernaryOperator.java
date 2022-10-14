package javaclasses;

public class TernaryOperator {

    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 10;

        if (num1 > num2) {

            System.out.println("num1 is greater");
        } else {
            System.out.println("num2 is greater");
        }
        String result = (num1 > num2) ? "num1 is greater" : "num2 is greater";



///program using ternary operator//

        int number1 = 24, number2 = 22, res;
        System.out.println("first number:   " + number1);
        System.out.println("second number:   " + number2);

        res = (number1 > number2) ? (number1 + number2) : (number1 - number2);
        System.out.println("output =" +res);
    }
}
