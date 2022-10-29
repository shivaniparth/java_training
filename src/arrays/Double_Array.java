package arrays;

public class Double_Array {

    public static void main(String[] args) {
        //SYNTAX : Datatype varName []= {value1,value2,value3........};

        double weightArray[] = {10.5, 34.6, 56.9, 40.1, 50.5};
        //  read or get
        //TODO varName[INDEX];

        System.out.println("Printing index 1 " + weightArray[1]);
        System.out.println("Printing index 3 " + weightArray[2]);
        System.out.println("Printing index 0 " + weightArray[3]);

        for (int i = 0; i < weightArray.length; i++) {

            System.out.println("Printing Array in Loop " + weightArray[i]);
        }
        //ADVANCED FOR LOOP
        //TODO  for (Datatype varName : Array/Collection){ CODE }
        for (double var : weightArray) {

            System.out.println("Printing Advanced  Loop " + var);
        }
    }
}
