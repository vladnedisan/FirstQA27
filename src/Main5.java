public class Main5 {

    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations();
//       int[] myArray = op.populateArrayUpToNumber(100);
//        op.printArray(myArray);


        int[] secondArray = {1,2,45,123123,111,333};
        System.out.println(op.getAverageFromArray(secondArray));
        String[] myArrayOfStrings ={"x", "y", "z"};
        System.out.println();
        if (op.isValueInArray(myArrayOfStrings, "z"))
        System.out.println("Valoarea e in array");
        else
        System.out.println("Valoarea nu e in array");


    }
}