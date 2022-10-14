package javaclasses;

public class MethodInJava {

    void display() {
        System.out.println("display method");///void means no return
    }

    static void show() {
        System.out.println("static show method");
    }

    String MethodWithStringValue() {
        return "abcdefghijklmnopqrstuvwxyz";
    }

    int methodWithReturnIntValue() {
        return 1234554657;
    }

    boolean methodWithReturnBooleanValue() {
        return true;
    }

    static float returnFloatValue() {
        return 30.0F;
    }

    static int returnIntValue1(){
        return 98765;

    }

        short methodWithReturnShortValue(){
            return 25641;
        }
        long methodWithReturnLongValue(){
        return 245458;
        }


    public static void main(String[] a) {
        MethodInJava obj = new MethodInJava();///new logical address denote or  static
        obj.display();
        show();
        String returnValue = obj.MethodWithStringValue();
        System.out.println(returnValue);
           int returnIntValue = obj.methodWithReturnIntValue();
           System.out.println(returnIntValue);
               boolean returnBooleanValue = obj.methodWithReturnBooleanValue();
               System.out.println(returnBooleanValue);
                   short returnShortValue = obj.methodWithReturnShortValue();
                   System.out.println(returnShortValue);
                      long returnLongValue = obj.methodWithReturnLongValue();
                      System.out.println(returnLongValue);
                         float returnFloatValue =  returnFloatValue();
                         System.out.println(returnFloatValue);
                             int returnIntValue1 = returnIntValue1();
                             System.out.println(returnIntValue1);

    }
}
