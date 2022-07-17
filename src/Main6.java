import java.util.ArrayList;
import java.util.List;

public class Main6 {


    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();


//        System.out.println(myList.get(0));
//        myList.remove(Integer.valueOf(3));
//        System.out.println(myList.size());
//        List<Float> myListOfFloats = new ArrayList<>();
//        myListOfFloats.add(3.4F);
//        myListOfFloats.remove(3.4f);
//        System.out.println(myListOfFloats.size());
//        myList.add(3);
//        myList.add(3);
//        myList.add(3);
//        myList.add(3);
//        myList.add(3);
//        myList.set(2, 5);
//        myList.add(2, 5);
//        int a = 1;
//        String z = "1";
//        List<String> myListOfStrings = new ArrayList<>();

        List<Integer> myListOfInt = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            myListOfInt.add(i);
        }
//        System.out.println(myListOfStrings);
//        for (String value :( myListOfStrings) {
//            System.out.print(value + ", ");
//        }


        LogicalOperations op = new LogicalOperations();
        //  op.printNumbersFromList(myListOfInt);
        //  List<Integer> z = new ArrayList<>();
        System.out.println("Tema nr 1 : \n");
        op.addNumberAtTheEnd(myListOfInt, 101);
        System.out.println("Tema nr 2 : \n");
        op.printNumbersFromList(myListOfInt);
        System.out.println("Tema nr 3 : \n");
        op.printFromGivenNr(myListOfInt, 5);
        System.out.println("Tema nr 4 : \n");
        op.printNumbersBackwardsFromList(myListOfInt);
        System.out.println("Tema nr 5 : \n");
        List<String> myListOfString = new ArrayList<>();
        op.addStringInPositionOfIntNumber(myListOfString, 0, "a");
        System.out.println("Tema nr 6 : \n");
        op.addNumberAtTheBeginning(myListOfInt, 6);
        System.out.println("Tema nr 7 : \n");
        ArrayList<String> arrlist = new ArrayList<>();
        arrlist.add("Fast");
        arrlist.add("Track");
        arrlist.add("IT");
        arrlist.add("QA27");
        arrlist.add("Test");

        op.printNumberAndIndex(arrlist);
        System.out.println("\n");
        System.out.println("Tema nr 8 : \n");
        op.getHighestNumberFromList((myListOfInt));
    }
}