package loop;

public class WhileLoop_Factorial {
    public static void main(String[] args) {

    int num= 4, fact = 1, i = 1;
    while(i<=num){

        fact = fact *i ;
        i++;
    }

        System.out.println("FACTORIAL OF "+num+ "is : " +fact );

    }
}
