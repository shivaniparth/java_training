package javaclasses;

public class Count_Occr {

    public static void main(String[] args) {

    String str = "JAVA IS A PROGRAMMING LANGUAGE";
    char ch = 'A';
    int count = 0;

        for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == ch)
            count++;
    }
        System.out.println("Occurrences of " + ch + " are :   " + count);
}
}
