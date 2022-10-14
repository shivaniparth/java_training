package javaclasses;

public class ConditionalStatementSwitchCase {

    public static void main(String[] args) {
        String color = "red";       //color program using switch case//
        switch (color) {
            case "red":
                System.out.println("color is red");
                break;

            case "yellow":
                System.out.println("this is yellow");
                break;

            case "pink":
                System.out.println("this is pink");
                break;

            case "green":
                System.out.println("this is green");
                break;

            case "orange":
                System.out.println("this is orange");
                break;

            case "blue":
                System.out.println("this is blue");

            default:
                System.out.println("color is not matched");
        }



                int day= 2;                 //week program using switch case//
                switch (day){
                    case 1 :
                        System.out.println("SUNDAY");
                        break;

                    case 2:
                        System.out.println("MONDAY");
                        break;

                    case 3:
                        System.out.println("WEDNESDAY");
                        break;

                    case 4:
                        System.out.println("THURSDAY");
                        break;

                    case 5:
                        System.out.println("FRIDAY");
                        break;

                    case 6:
                        System.out.println("SATURDAY");
                        break;

                    case 7: default:
                        System.out.println("RESULT NOT MATCHED");

                }

                String month = "april";
                switch(month){

                    case "january":
                        System.out.println("month is january");
                        break;

                    case "february":
                        System.out.println("month is february");
                        break;

                    case "march":
                        System.out.println("month is march");
                        break;

                    case "april":
                        System.out.println("month is april");
                        break;

                    case "may":
                        System.out.println("month is may");
                        break;

                    case "june":
                        System.out.println("month is june");
                        break;

                    case "july":
                        System.out.println("month is july");
                        break;

                    case "august":
                        System.out.println("month is august");
                        break;

                    case "september":
                        System.out.println("month is september");
                        break;

                    case "october":
                        System.out.println("month is october");
                        break;

                    case "november":
                        System.out.println("month is november");
                        break;

                    case "december":
                        System.out.println("month is december");
                        break;

                    case "default":
                        System.out.println("RESULT IS NOT MATCHED");

                }

        }


    }







