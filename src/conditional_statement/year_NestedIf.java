package conditional_statement;

public class year_NestedIf {
    public static void main(String[] args) {
        int month = 30;
        int year = 2020;

        if (year % 4 == 0) {

            if (month % 7 == 3) {

                System.out.println("In january month   : 31 days ");
            }
            else {

                System.out.println("wrong information");
            }
                   if(month % 7==2){

                     System.out.println("in april month   : 30days");
            }
                     else{
                       System.out.println("incorrect information");
                   }
              }      else {

                    System.out.println("month is february     :28days ");

        }
    }
}
