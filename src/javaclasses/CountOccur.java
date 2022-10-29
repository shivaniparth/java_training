package javaclasses;

public class CountOccur {
    public static void main(String[] args) {

        String str = "JAVA";
        char ch = 'A';
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                cnt++;
        }
        System.out.println("Occurrences of " + ch + " are  :  " + cnt);
    }


}
