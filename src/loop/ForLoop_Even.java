package loop;

public class ForLoop_Even {

    public static void main(String[] args) {

        int n = 100;

        System.out.println("EVEN NUMBERS FROM 1 TO 100 ARE :   ");

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {

                System.out.println(i + "   ");
            }
        }
    }
}

