import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
//        Given two numbers,
//        see which one is the greatest and print it
        System.out.println("Tema nr 3 : \n");
        int first = 5;
        int second = 4;

        LogicalOperations op = new LogicalOperations();
        System.out.println("Greater value is: " + op.getGreaterNumber(first, second) + "\n");

//        Given a text input and a number input,
//        if the text is equal to “FastTrack” AND
//        the number is equal to or lower than 3,
//        print the text and the number.
//        If the text is not “FastTrack” AND the
//        number is equal to or higher than 4,
//        print the number and the text, in this order.
//        String textInput1 = "FastTrackIT";
//        System.out.println(op.verifyTextAndNumber(textInput1));
        //2. Given a text input, if it is “FastTrack”,
        // then print “Learning text comparison”.
        // If not, print “Got to try some more”
        System.out.println("Tema nr 4 : \n");
        String textInput3 = "FastTrackIT";
        System.out.println((op.TextComparison(textInput3)) + "\n");
        System.out.println("Tema nr 5 : \n");
        String textInput1 = " FastTrackIT ";
        int number1 = 4;
        System.out.println(op.verifyTextAndNumber(textInput1, number1) + '\n');
        System.out.println("Tema nr 6 : \n");
        int number2 = 9;
        System.out.println(op.BiggerSnow(number2) + '\n');
        System.out.println("Tema nr 7 : \n");
        int number3 = 2;
        System.out.println(op.BiggerNumber(number3) + '\n');
        System.out.println("Tema nr 8 : \n");
        Scanner returnNr = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 10: ");
        int nrReturn = returnNr.nextInt();
        System.out.println(op.ReturnNumber(nrReturn));
        System.out.println("Tema nr 9 : \n");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        System.out.println(op.isNumberEven(num) + "\n");
        System.out.println("Tema nr 10 : \n");
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter person age: ");
        int age = scan1.nextInt();
        System.out.println(op.isEligibleToVote(age));
        System.out.println("\n");
        System.out.println("Tema nr 11 : \n");
        Scanner x1 = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int nr1 = x1.nextInt();
        Scanner y1 = new Scanner(System.in);
        System.out.print("Enter second number: ");
        int nr2 = y1.nextInt();
        Scanner z1 = new Scanner(System.in);
        System.out.print("Enter third number: ");
        int nr3 = z1.nextInt();
        System.out.println(op.GreatNumber7(nr1, nr2, nr3) + '\n');

    }
}
