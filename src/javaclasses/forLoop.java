package javaclasses;

public class forLoop {

    public static void main(String[] args) {

        for(int i=1; i<=10;i++)  {            //print 1 to 10 numbers using for loop//
            System.out.println(i);
        }

        for(int i=1; i<=100; i++){            //print 1 to 100 numbers using for loop//
            System.out.print(i +",");
        }

        for(char ch='a'; ch<=122;ch++) {      //print char a to z using ascii value//
            System.out.println(ch + ",");
        }

        for(char ch='A'; ch<=90;ch++) {       //print char A to Z using ascii value//
            System.out.print(ch + ",");
        }
        for(char ch='a'; ch<='z';ch++) {      //print char a to z using for loop//
            System.out.print(ch + ",");
        }

        for(int i= 300;i<=500;i++){           //print the value from 300 to 500 using for loop//
            System.out.println(i);
        }
        for(int i= 20; i<=50;i++){         //print the value from 20 to 50 using for loop//
            System.out.println(i);
        }

        int sum = 0;                              //print the sum of ten numbers from 1 to 10 using for loop//
        for(int num =1; num<=10; num= num+1)
            sum=sum+num;
        {
            System.out.println(sum);
        }



    }



}
