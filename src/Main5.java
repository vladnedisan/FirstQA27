public class Main5 {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations();
//      int[] myArray = op.populateArrayUpToNumber(100);
//        op.printArray(myArray);

        System.out.println("Tema nr 2 : \n");
        int[] myArray = op.populateArrayUpTo100(100);
        op.printArray(myArray);
        System.out.println("\n");
        System.out.println("Tema nr 3 : \n");
        int[] arr = new int[100];
        op.populateArrayUpToEven100(arr);
        System.out.println("\n");
        System.out.println("Tema nr 4 : \n");
        System.out.println(op.getAverageFromArrayT(myArray));
        System.out.println("Tema nr 5 : \n");
        System.out.println(op.isValueInArray(new String[]{"one", "two", "three", "four", "five"}, "five"));
        System.out.println("Tema nr 6 : \n");
        System.out.println(op.isNumberInArrayNr(new int[]{4, 5, 6, 7, 8, 9}, 9));
        System.out.println("Tema nr 7 : \n");
        int[] array = new int[100];
        op.printSymbols(array);
        System.out.println("Tema nr 8 : \n");
        int[] myArrayToNr2 = new int[]{4, 5, 6, 7, 8, 9,13,16,17};
        op.isValueInArrayNr2(myArrayToNr2, 7);
        System.out.println("\n");
        System.out.println("Tema nr 9 : \n");
        int[] secondArrayLow = {31, 4, 3, 11, 2, 8};
        int myArrayToNr3 = op.populateArrayToNr3(secondArrayLow);
        System.out.println(myArrayToNr3);
        //op.printArray(myArrayToNr3);
        System.out.println("\n");
        System.out.println("Tema nr 10 : \n");
        int[] array1 = {1, 5, 4, 11, 2, 7};
        int array2[] = new int[array1.length];
        op.copyArray(array1, array2);
    }
}
