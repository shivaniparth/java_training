package javaclasses;

public class MethodWithParameter {
  //non static method without parameter//
    void add() {
        int num1 = 50;
        int num2 = 5;
        System.out.println(num1 / num2);
    }

    void sub() {
        int a = 25;
        int b = 10;
        System.out.println(a - b);
    }

    void mul() {
        int value1 = 100;
        int value2 = 200;
        System.out.println(value1 * value2);
    }

    void div() {
        int x = 80;
        int y = 10;
        System.out.println(x / y);
    }

    void mod() {
        int A = 20;
        int B = 3;
        System.out.println(A % B);
    }




  //static method without parameter//

    static void addition() {
        int num1 = 10000;
        int num2 = 30000;
        System.out.println(num1 / num2);
    }

    static void subtraction() {
        int a = 2500;
        int b = 100;
        System.out.println(a - b);
    }

    static void multiplication() {
        int value1 = 900;
        int value2 = 100;
        System.out.println(value1 * value2);
    }

    static void division() {
        int x = 8780;
        int y = 10;
        System.out.println(x / y);
    }

    static void module() {
        int A = 35;
        int B = 4;
        System.out.println(A % B);
    }


        public static void main(String[] args){
            MethodWithParameter obj = new MethodWithParameter();
            obj.add();
            obj.sub();
            obj.mul();
            obj.div();
            obj.mod();
            obj.message("java is independent language");
            obj.name("parth");
            obj.laptopName("SAMSUNG");
            obj.mobileNumber("9650495244");
            obj.email("jkghkfh");
            //call static method//
            addition();
            subtraction();
            multiplication();
            division();
            module();
            obj.sep(10, 20);
            obj.add(20, 30);
            obj.sub(50, 20);
            obj.mul(300,20);
            obj.div(30,3);

            addition(10,20);
            subtraction(40,458);
            multiplication(78254,4545);
            division(50,2);



        }

    void message(String message){ //method with parameter//
        System.out.println(message);
    }
    void name (String name){//method with parameter//
        System.out.println(name);
    }
    void laptopName(String name){//method with parameter//
        System.out.println(name);
    }

    void mobileNumber(String number){//method with parameter//
        System.out.println(number);
    }
    void email(String id){//method with parameter//
        System.out.println(id);

    }
    void sep(int a, int b) {   //method with parameter//
        System.out.println(a - b);
    }
    void add(int x , int y ){
        System.out.println(x+y);
    }

    void sub(int A , int B ){
        System.out.println(A-B);
    }

    void mul(int num1, int num2){
        System.out.println(num1*num2);
    }
    void div(int value1, int value2){
        System.out.println(value1/value2);
    }


    static void addition(int x , int y ){
        System.out.println(x+y);
    }

    static void subtraction(int A , int B ){
        System.out.println(A-B);
    }

    static void multiplication(int num1, int num2){
        System.out.println(num1*num2);
    }
    static void division(int value1, int value2){
        System.out.println(value1/value2);
    }

}


