package arrays;

public class int_Array {
    public static void main(String[] args) {

        //SYNTAX : Datatype varName []= {value1,value2,value3........};
        int ageArray[] = {10, 20, 30, 40, 50};

        //  read or get
        //TODO varName[INDEX];

        System.out.println("Printing index 1 " + ageArray[1]);
        System.out.println("Printing index 3 " + ageArray[2]);
        System.out.println("Printing index 0 " + ageArray[3]);

        for (int i = 0; i < ageArray.length; i++) {

            System.out.println("Printing Array in Loop " + ageArray[i]);
        }
        //ADVANCED FOR LOOP
        //TODO  for (Datatype varName : Array/Collection){ CODE }

        for (int var : ageArray) {

            System.out.println("Printing Advanced  Loop " + var);
        }
    }
}
