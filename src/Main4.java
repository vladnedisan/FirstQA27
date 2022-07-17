import java.util.ArrayList;
import java.util.List;

public class Main4 {


    public static void main(String[] args) {

//        Given a number, while the number
//        is equal to or lower than 100, print the number;
        LogicalOperations op = new LogicalOperations();
//       int x = 12;
//       op.printToHundred(x);
//Write a program
// called SumAndAverage to produce the
// sum of 1, 2, 3, ..., to 100. Also
// compute and display the average.
//       System.out.println(op.sumAndAverage());
//       System.out.println(op.getAverageInInterval(111, 8899));
//        System.out.println(op.getAverageForEvenInInterval(1 , 100));
        System.out.println("Tema For Loops:");
        System.out.println("Tema nr 1 : \n");
        op.countTo100(70);
        System.out.println("Tema nr 2 : \n");
        op.countToMinus100(-80);
        System.out.println("Tema nr 3 : \n");
        op.countBetweenTwoNr(3, 7);
        System.out.println("Tema nr 4 : \n");
        op.countToBiggestNr(2, 5);
        System.out.println("Tema nr 5 : \n");
        op.evenNrTo100();
        System.out.println("Tema nr 6 : \n");
        op.notEvemNrTo100();
        System.out.println("Tema nr 7 : \n");
        op.sumTo100(5);
        System.out.println("Tema nr 8 : \n");
        op.sumAndAverageTema(5);
        System.out.println("Tema nr 9 : \n");
        op.printAsterisk();
        System.out.println("Tema For While:");
        System.out.println("Tema nr 1 : \n");
        op.countTo100WL(97);
        System.out.println("Tema nr 2 : \n");
        op.countToMinus100WL(-97);
        System.out.println("Tema nr 3 : \n");
        op.countBetweenTwoNrWL(3, 9);
        System.out.println("Tema nr 4 : \n");
        op.countToBiggestNrWL(10, 7);
        System.out.println("Tema nr 5 : \n");
        op.evenNrTo100WL();
        System.out.println("Tema nr 6 : \n");
        op.notEvemNrTo100WL();
        System.out.println("Tema nr 7 : \n");
        System.out.println(op.getAverageInIntervalWL());
        System.out.println("Tema nr 8 : \n");
        System.out.println(op.divideWith7WL(1, 17));
        System.out.println("Tema nr 9 : \n");
        op.nrFibonacci();
        System.out.println("Tema nr 10 : \n");
        op.cozaLozaWoza();

    }

    public static class Main6 {
        public static void main(String[] args) {
            List<Integer> myList = new ArrayList<>();
            myList.add(3);
            System.out.println(myList.size());

        }
    }
}
