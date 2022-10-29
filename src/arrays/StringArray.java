package arrays;

public class StringArray {
    public static void main(String[] args) {

        String student1 = "RAJ";
        String student2 = "PARTH";
        String student3 = "SHIVANI";
        String student4 = "SHIVA";
        String student5 = "SHIVANI";
        String student6 = "KETAN";


        //SYNTAX : Datatype varName []= {value1,value2,value3........};

        String studentArray[] = {"RAJ", "PARTH", "SHIVANI", "SHIVA", "SHIVANI", "KETAN"};

        //  read or get
        //TODO varName[INDEX];

        System.out.println("Printing index 1 " + studentArray[1]);
        System.out.println("Printing index 3 " + studentArray[3]);
        System.out.println("Printing index 0 " + studentArray[0]);

        for (int i = 0; i < studentArray.length; i++) {

            System.out.println("Printing Array in Loop " + studentArray[i]);

        }

        //ADVANCED FOR LOOP
        //TODO  for (Datatype varName : Array/Collection){ CODE }

        for (String var : studentArray) {

            System.out.println("Printing Advanced  Loop " + var);
        }

        //using for loop
        for (int i=0; i< studentArray.length; i++){

            System.out.println("Printing STUDENTS NAME .."+studentArray[i]);
        }
    }
}
