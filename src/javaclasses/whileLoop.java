package javaclasses;

public class whileLoop {
    public static void main(String[] args) {

        int i = 1;              //print 1 to 10 no using while loop//
        while(i<=10){
            System.out.print(i+ ",");
            i++;
        }

        char ch = 'a';               //print a to z using while loop//
        while(ch <='z'){
            System.out.print(ch+ ",");
            ch++;
        }

        int value= 1;                              //print 1 to 100 number using while loop//
        while(value<=100){
            System.out.print(value + ",");
            value++;
        }

        int num= 20;                               //print 20 to 50 numbers using while loop//
        while(num<=50){
            System.out.print(num+ ",");
            num++;
        }
//        int no= 0;
//        while(i<=10){
//            no=no+i;
//            System.out.println(no);
//            no= no+1;
//        }

    }
}
