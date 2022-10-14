package javaclasses;

public class VariableScope {
    String stringVariable = "java";

    void display(){
        System.out.println("display method : " +stringVariable);

    }

    void show() {
        System.out.println("show method : " +stringVariable);
    }

      int add(){
        int number1 = 50;
        int number2 = 40;
        return number1+number2;
    }

      int sub(){
        int num1 = 24;
        int num2 = 21;
          return num1 - num2;

      }

    public static void main(String[] args) {
        VariableScope obj = new VariableScope();
        obj.display();
        obj.show();

        System.out.println(obj.stringVariable);
        int sum = obj.add();
        System.out.println(sum);

        int sub = obj.sub();
        System.out.println(sub);


    }
}



