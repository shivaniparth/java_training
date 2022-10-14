package javaclasses;

public class NestedLoop {

    public static void main(String[] args) {    //left triangle star//
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 1; i <= 5; i++) {                    //left down triangle star//
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

  }


