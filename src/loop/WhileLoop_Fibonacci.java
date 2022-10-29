package loop;

public class WhileLoop_Fibonacci {

    public static void main(String[] args) {
        int count = 6, num1=0, num2 =1, i= 1;
        while(i<=count){

            System.out.print(num1+ "  ");

            int sumOfPreviousTwo = num1+num2;

            num1= num2;
            num2= sumOfPreviousTwo;
            i++;
        }

    }
}
