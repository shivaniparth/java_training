package loop;

public class ForLoop_fact {

    public static void main(String[] args) {
        int i, fact = 1, num = 4;

        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("FACTORIAL OF " + num + " is: " + fact);
    }

}

