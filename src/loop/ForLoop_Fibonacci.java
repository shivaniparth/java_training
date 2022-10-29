package loop;

public class ForLoop_Fibonacci {
    public static void main(String[] args) {

        int num = 5, num1 = 0, num2 = 1;
        System.out.println("FIBONACCI SERIES OF " + num + " is ");

        for (int i = 1; i <= num; ++i) {
            System.out.println(num1 + "   ");

            int sumOfPrevTwo = (num1 + num2);
            num1 = num2;
            num2 = sumOfPrevTwo;

        }
    }
}
